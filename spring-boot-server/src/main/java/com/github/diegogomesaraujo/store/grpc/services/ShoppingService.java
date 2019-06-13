package com.github.diegogomesaraujo.store.grpc.services;

import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.github.diegogomesaraujo.documents.Product;
import com.github.diegogomesaraujo.repositories.CartRepository;
import com.github.diegogomesaraujo.repositories.ProductRepository;
import com.github.diegogomesaraujo.store.grpc.CartRPC;
import com.github.diegogomesaraujo.store.grpc.ProductRPC;
import com.github.diegogomesaraujo.store.grpc.ProductRequestRPC;
import com.github.diegogomesaraujo.store.grpc.ProductResponseRPC;
import com.github.diegogomesaraujo.store.grpc.ProductResponseRPC.Builder;
import com.github.diegogomesaraujo.store.grpc.ShoppingServiceGrpc.ShoppingServiceImplBase;
import com.github.diegogomesaraujo.store.grpc.mappers.GRPCMapper;
import com.google.protobuf.Empty;

import io.grpc.stub.StreamObserver;

@GRpcService
public class ShoppingService extends ShoppingServiceImplBase {
	
	@Autowired
	private CartRepository cartRepository;

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	@Qualifier("product")
	private GRPCMapper<ProductRPC, Product> productMapper;
	
	@Override
	public void listProducts(ProductRequestRPC request, StreamObserver<ProductResponseRPC> responseObserver) {
		int size = 10;
		
		if(request.getSize() > 0) {
			size = request.getSize();
		}
		
		Page<Product> products = productRepository.findAll(PageRequest.of(request.getPage(), size));
		
		Builder productResponse = ProductResponseRPC.newBuilder();
		
		products.forEach(p -> productResponse.addProducts(productMapper.toRpc(p)));
		
		responseObserver.onNext(productResponse.build());
		responseObserver.onCompleted();
	}

	@Override
	public StreamObserver<ProductRPC> addToCart(StreamObserver<CartRPC> responseObserver) {
		// TODO Auto-generated method stub
		return super.addToCart(responseObserver);
	}

	@Override
	public void removeFromCart(ProductRPC request, StreamObserver<CartRPC> responseObserver) {
		// TODO Auto-generated method stub
		super.removeFromCart(request, responseObserver);
	}

	@Override
	public void getCart(Empty request, StreamObserver<CartRPC> responseObserver) {
		// TODO Auto-generated method stub
		super.getCart(request, responseObserver);
	}

}
