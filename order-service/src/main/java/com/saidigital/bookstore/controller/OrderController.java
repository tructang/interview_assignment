package com.saidigital.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saidigital.bookstore.model.OrderItem;
import com.saidigital.bookstore.services.OrderService;

@RestController
//@CrossOrigin(maxAge = 3600)
@RequestMapping("/orders")
public class OrderController {
	@Autowired
    private OrderService orderService;
	
	@GetMapping
    public List<OrderItem> getOrders() {
        return orderService.getAllOrders();
    }

    @PostMapping
    public void createOrder(@RequestBody OrderItem order) {
        orderService.createOrder(order);
    }	

}
