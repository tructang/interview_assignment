package com.saidigital.bookstore.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@Entity(name="product")
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
