package com.github.diegogomesaraujo.documents;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.redis.core.index.Indexed;

import lombok.Data;

@Data
@Document(collection = "products")
public class Product {

	@Id
	private String id;
	
	@Indexed
	private String name;

	@Indexed
    private String description;

	@Indexed
    private BigDecimal price;
	
}
