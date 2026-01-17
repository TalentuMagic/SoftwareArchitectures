package org.example.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.Order;
import org.example.command.CancelOrderCommand;
import org.example.command.PlaceOrderCommand;
import org.example.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @GetMapping
    public List<Order> getAll() {
        return orderService.getAll();
    }

    @GetMapping("/{id}")
    public Order getById(@PathVariable Long id) {
        return orderService.getById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void place(@RequestBody Order order) {
        // Command pattern: encapsulate action as an object
        new PlaceOrderCommand(orderService, order).execute();
    }

    @PostMapping("/{id}/cancel")
    public void cancel(@PathVariable Long id) {
        new CancelOrderCommand(orderService, id).execute();
    }
}
