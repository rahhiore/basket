package com.spring.controller;

import com.spring.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    private final OrderService orderService;

    private OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
    @GetMapping("/add")
    private String addItems(@RequestParam("ID") List<Integer> ID) {
        orderService.addItems(ID);
        return "Successful";
    }

    @GetMapping("/get")
    private List<Integer> getItems() {
        return orderService.getItems();
    }
}
