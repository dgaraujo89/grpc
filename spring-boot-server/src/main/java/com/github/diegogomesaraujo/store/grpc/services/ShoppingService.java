package com.github.diegogomesaraujo.store.grpc.services;

import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

import com.github.diegogomesaraujo.repositories.ProductRepository;
import com.github.diegogomesaraujo.store.grpc.Cart;
import com.github.diegogomesaraujo.store.grpc.Product;
import com.github.diegogomesaraujo.store.grpc.ProductRequest;
import com.github.diegogomesaraujo.store.grpc.ProductResponse;
import com.github.diegogomesaraujo.store.grpc.ShoppingGrpc.ShoppingImplBase;
import com.google.protobuf.Empty;

import io.grpc.stub.StreamObserver;

@GRpcService
public class ShoppingService extends ShoppingImplBase {
	
	@Autowired
	private RedisTemplate<Object, Object> redisTemplate;

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public void listProducts(ProductRequest request, StreamObserver<ProductResponse> responseObserver) {
		// TODO Auto-generated method stub
		super.listProducts(request, responseObserver);
	}

	@Override
	public StreamObserver<Product> addToCart(StreamObserver<Cart> responseObserver) {
		// TODO Auto-generated method stub
		return super.addToCart(responseObserver);
	}

	@Override
	public void removeFromCart(Product request, StreamObserver<Cart> responseObserver) {
		// TODO Auto-generated method stub
		super.removeFromCart(request, responseObserver);
	}

	@Override
	public void getCart(Empty request, StreamObserver<Cart> responseObserver) {
		// TODO Auto-generated method stub
		super.getCart(request, responseObserver);
	}

}
