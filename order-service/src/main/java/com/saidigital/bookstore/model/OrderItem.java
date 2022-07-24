package com.saidigital.bookstore.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem {
	
	@Id
	@NonNull
    @GeneratedValue(strategy= GenerationType.AUTO)
	private String id;	
	private String bookItemId;
	private long  quantity;
	private long orderAt;

}
