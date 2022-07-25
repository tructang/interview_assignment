package com.saidigital.bookstore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@Entity(name="orders")
@NoArgsConstructor
public class OrderItem {
	
	@Id
	@NonNull
    @GeneratedValue(strategy= GenerationType.AUTO)
	private String id;	
	@Column(name = "book_item")
	private String bookItemId;
	@Column(name = "quantity")
	private long  quantity;
	@Column(name = "create_at")
	private long orderAt;

}
