package com.saidigital.bookstore.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.saidigital.bookstore.model.OrderItem;

@Repository
public interface OrderRepository extends CrudRepository<OrderItem, Long> {

}
