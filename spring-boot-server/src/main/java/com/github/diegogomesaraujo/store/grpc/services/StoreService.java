package com.github.diegogomesaraujo.store.grpc.services;

import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.github.diegogomesaraujo.documents.Product;
import com.github.diegogomesaraujo.repositories.ProductRepository;
import com.github.diegogomesaraujo.store.grpc.ProductRPC;
import com.github.diegogomesaraujo.store.grpc.ResponseRPC;
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
	public void createProduct(ProductRPC request, StreamObserver<ResponseRPC> responseObserver) {
		productRepository.save(productMapper.fromRpc(request));
		
		ResponseRPC response = ResponseRPC.newBuilder()
				.setCode("0")
				.setMessage("The product was created")
				.build();
		
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void updateProduct(ProductRPC request, StreamObserver<ResponseRPC> responseObserver) {
		productRepository.save(productMapper.fromRpc(request));
		
		ResponseRPC response = ResponseRPC.newBuilder()
				.setCode("0")
				.setMessage("The product was updated")
				.build();
		
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void deleteProduct(ProductRPC request, StreamObserver<ResponseRPC> responseObserver) {
		productRepository.deleteById(request.getId());
		
		ResponseRPC response = ResponseRPC.newBuilder()
				.setCode("0")
				.setMessage("The product was deleted")
				.build();
		
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

}
