package com.github.diegogomesaraujo.store.grpc.services;

import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.github.diegogomesaraujo.documents.Product;
import com.github.diegogomesaraujo.repositories.ProductRepository;
import com.github.diegogomesaraujo.store.grpc.MessageResponse;
import com.github.diegogomesaraujo.store.grpc.ProductRPC;
import com.github.diegogomesaraujo.store.grpc.StoreServiceGrpc.StoreServiceImplBase;
import com.github.diegogomesaraujo.store.grpc.mappers.GRPCMapper;

import io.grpc.stub.StreamObserver;

@GRpcService
public class StoreService extends StoreServiceImplBase {

	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	@Qualifier("product")
	private GRPCMapper<ProductRPC, Product> productMapper;

	@Override
	public void createProduct(ProductRPC request, StreamObserver<MessageResponse> responseObserver) {
		productRepository.save(productMapper.fromRpc(request));
		
		MessageResponse response = MessageResponse.newBuilder()
				.setMessage("The product was created")
				.build();
		
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void updateProduct(ProductRPC request, StreamObserver<MessageResponse> responseObserver) {
		productRepository.save(productMapper.fromRpc(request));
		
		MessageResponse response = MessageResponse.newBuilder()
				.setMessage("The product was updated")
				.build();
		
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void deleteProduct(ProductRPC request, StreamObserver<MessageResponse> responseObserver) {
		productRepository.deleteById(request.getId());
		
		MessageResponse response = MessageResponse.newBuilder()
				.setMessage("The product was deleted")
				.build();
		
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

}
