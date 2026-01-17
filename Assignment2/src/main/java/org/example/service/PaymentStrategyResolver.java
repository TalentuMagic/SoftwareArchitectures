package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.payment.PaymentStrategy;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class PaymentStrategyResolver {
    private final Map<String, PaymentStrategy> strategies;

    public PaymentStrategy resolve(String paymentMethod) {
        PaymentStrategy strategy = strategies.get(paymentMethod);
        if (strategy == null) {
            throw new IllegalArgumentException("Unsupported payment method: " + paymentMethod);
        }
        return strategy;
    }
}
