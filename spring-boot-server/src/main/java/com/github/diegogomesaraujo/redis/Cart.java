package com.github.diegogomesaraujo.redis;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import com.github.diegogomesaraujo.documents.Product;

import lombok.Data;

@Data
@RedisHash("cart")
public class Cart implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	
	@Indexed
	private List<Product> products;
	
}
