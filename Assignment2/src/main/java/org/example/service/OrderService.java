package org.example.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.Order;
import org.example.handler.InventoryCheckHandler;
import org.example.handler.PaymentValidationHandler;
import org.example.notification.NotificationService;
import org.example.repository.OrderRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;
    private final InventoryCheckHandler inventoryCheckHandler;
    private final PaymentValidationHandler paymentValidationHandler;
    private final PaymentStrategyResolver paymentStrategyResolver;
    private final NotificationService notificationService;

    public List<Order> getAll() {
        return orderRepository.findAll();
    }

    public Order getById(Long id) {
        return orderRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Order not found: " + id));
    }

    @Transactional
    public Order placeOrder(Order order) {
        // Chain of Responsibility: build validation pipeline
        inventoryCheckHandler.setNext(paymentValidationHandler);
        inventoryCheckHandler.validate(order);

        // Persist initial order
        if (order.getStatus() == null || order.getStatus().isBlank()) {
            order.setStatus("NEW");
        }
        Order saved = orderRepository.save(order);

        // Strategy: pick payment algorithm at runtime
        paymentStrategyResolver.resolve(saved.getPaymentMethod()).pay(saved.getTotalAmount());

        // Update status + persist
        saved.updateStatus("PLACED");
        saved = orderRepository.save(saved);

        // Observer: notify subscribers
        notificationService.notifyObservers("Order " + saved.getId() + " status changed to " + saved.getStatus());
        return saved;
    }

    @Transactional
    public Order cancelOrder(Long id) {
        Order existing = getById(id);
        existing.updateStatus("CANCELED");
        Order saved = orderRepository.save(existing);
        notificationService.notifyObservers("Order " + saved.getId() + " status changed to " + saved.getStatus());
        log.info("Order {} canceled.", saved.getId());
        return saved;
    }
}
