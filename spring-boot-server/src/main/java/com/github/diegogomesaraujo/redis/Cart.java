package com.github.diegogomesaraujo.redis;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import com.github.diegogomesaraujo.documents.Product;

import lombok.Data;

@Data
@RedisHash("cart")
public class Cart {

	@Id
	private Long id;
	
	@Indexed
	private List<Product> products;
	
}
