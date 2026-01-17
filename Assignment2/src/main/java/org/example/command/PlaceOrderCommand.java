package org.example.command;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.Order;
import org.example.service.OrderService;

@Slf4j
@RequiredArgsConstructor
public class PlaceOrderCommand implements OrderCommand {
    private final OrderService orderService;
    private final Order order;

    @Override
    public void execute() {
        Order saved = orderService.placeOrder(order);
        log.info("Order placed successfully: {}", saved.getId());
    }
}
