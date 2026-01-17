package org.example.handler;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.Order;
import org.example.service.PaymentStrategyResolver;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class PaymentValidationHandler extends OrderValidationHandler {
    private final PaymentStrategyResolver paymentStrategyResolver;

    @Override
    public void validate(Order order) {
        if (order.getPaymentMethod() == null || order.getPaymentMethod().isBlank()) {
            throw new IllegalArgumentException("paymentMethod is required");
        }

        paymentStrategyResolver.resolve(order.getPaymentMethod());

        log.info("Payment validation passed for order {} (method={}).", order.getId(), order.getPaymentMethod());
        super.validate(order);
    }
}
