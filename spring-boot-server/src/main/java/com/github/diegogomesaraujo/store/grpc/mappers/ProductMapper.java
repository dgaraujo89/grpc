package com.github.diegogomesaraujo.store.grpc.mappers;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import com.github.diegogomesaraujo.documents.Product;
import com.github.diegogomesaraujo.store.grpc.ProductRPC;

@Component("product")
public class ProductMapper implements GRPCMapper<ProductRPC, Product> {

	@Override
	public ProductRPC toRpc(Product entity) {
		return ProductRPC.newBuilder()
				.setId(entity.getId())
				.setName(entity.getName())
				.setDescription(entity.getDescription())
				.setPrice(entity.getPrice().toPlainString())
				.build();
	}

	@Override
	public Product fromRpc(ProductRPC entityRpc) {
		Product product = new Product();
		product.setId(entityRpc.getId());
		product.setName(entityRpc.getName());
		product.setDescription(entityRpc.getDescription());
		product.setPrice(new BigDecimal(entityRpc.getPrice()));
		
		return product;
	}
	
}
