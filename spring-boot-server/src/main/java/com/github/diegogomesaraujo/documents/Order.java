package com.github.diegogomesaraujo.documents;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "orders")
public class Order {

	@Id
	private String id;
	
	private List<Product> products;
	
	private BigDecimal value;
	
}
