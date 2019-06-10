package com.github.diegogomesaraujo.store.grpc.services;

import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.diegogomesaraujo.repositories.ProductRepository;
import com.github.diegogomesaraujo.store.grpc.Product;
import com.github.diegogomesaraujo.store.grpc.Response;
import com.github.diegogomesaraujo.store.grpc.StoreServiceGrpc.StoreServiceImplBase;

import io.grpc.stub.StreamObserver;

@GRpcService
public class StoreService extends StoreServiceImplBase {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public void createProduct(Product request, StreamObserver<Response> responseObserver) {
		// TODO Auto-generated method stub
		super.createProduct(request, responseObserver);
	}

	@Override
	public void updateProduct(Product request, StreamObserver<Response> responseObserver) {
		// TODO Auto-generated method stub
		super.updateProduct(request, responseObserver);
	}

	@Override
	public void deleteProduct(Product request, StreamObserver<Response> responseObserver) {
		// TODO Auto-generated method stub
		super.deleteProduct(request, responseObserver);
	}

}
