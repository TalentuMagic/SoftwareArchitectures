package org.example.handler;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.Order;
import org.example.service.InventoryService;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class InventoryCheckHandler extends OrderValidationHandler {
    private final InventoryService inventoryService;

    @Override
    public void validate(Order order) {
        boolean ok = inventoryService.hasSufficientInventory(order);
        if (!ok) {
            throw new IllegalStateException("Insufficient inventory for order: " + order.getId());
        }
        log.info("Inventory check passed for order {}.", order.getId());
        super.validate(order);
    }
}
