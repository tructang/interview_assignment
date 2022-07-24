package com.saidigital.bookstore.model;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem {
	@Id
	private String id;
	private String itemId;
	private long  quantity;
	private long orderAt;

}
