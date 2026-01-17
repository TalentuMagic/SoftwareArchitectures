package org.example.service;

import lombok.extern.slf4j.Slf4j;
import org.example.Order;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class InventoryService {

    public boolean hasSufficientInventory(Order order) {
        log.debug("Inventory check (stub) for order {}.", order.getId());
        return true;
    }
}
