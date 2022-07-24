package com.saidigital.bookstore.services;

import java.util.List;

import com.saidigital.bookstore.model.OrderItem;

public interface OrderService {
	public void createOrder(OrderItem item);
	public List<OrderItem> getAllOrders();

}
