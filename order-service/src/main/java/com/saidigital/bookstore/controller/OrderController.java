package com.saidigital.bookstore.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	
	private static final Logger logger = LoggerFactory.getLogger(OrderController.class);
	
	@GetMapping
    public List<OrderItem> getOrders() {
		logger.info("get all order");
        return orderService.getAllOrders();
    }

    @PostMapping
    public void createOrder(@RequestBody OrderItem order) {
    	logger.info("create order");
        orderService.createOrder(order);
    }	

}
