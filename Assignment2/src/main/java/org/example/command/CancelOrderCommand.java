package org.example.command;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.service.OrderService;

@Slf4j
@RequiredArgsConstructor
public class CancelOrderCommand implements OrderCommand {
    private final OrderService orderService;
    private final Long orderId;

    @Override
    public void execute() {
        orderService.cancelOrder(orderId);
        log.info("Order canceled successfully: {}", orderId);
    }
}