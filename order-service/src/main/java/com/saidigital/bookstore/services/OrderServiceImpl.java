package com.saidigital.bookstore.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saidigital.bookstore.model.OrderItem;
import com.saidigital.bookstore.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	OrderRepository orderRepository;

	@Override
	public void createOrder(OrderItem item) {
		OrderItem orderItem = new OrderItem();
		orderItem.setBookItemId("1");
		orderItem.setQuantity(3);
		orderRepository.save(orderItem);		
	}

	@Override
	public List<OrderItem> getAllOrders() {		
		return (List<OrderItem>) orderRepository.findAll();
	}

}
