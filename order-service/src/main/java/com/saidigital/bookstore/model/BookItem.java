package com.saidigital.bookstore.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookItem {
	private String id;
	private String name;
	private long  quantity;
	private long price;

}
