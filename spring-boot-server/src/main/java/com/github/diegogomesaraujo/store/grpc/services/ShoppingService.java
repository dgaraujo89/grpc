package com.github.diegogomesaraujo.store.grpc.services;

import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.github.diegogomesaraujo.documents.Product;
import com.github.diegogomesaraujo.repositories.ProductRepository;
import com.github.diegogomesaraujo.services.CheckoutService;
import com.github.diegogomesaraujo.store.grpc.MessageResponse;
import com.github.diegogomesaraujo.store.grpc.PaginationRequest;
import com.github.diegogomesaraujo.store.grpc.PaymentRequest;
import com.github.diegogomesaraujo.store.grpc.ProductRPC;
import com.github.diegogomesaraujo.store.grpc.ProductResponse;
import com.github.diegogomesaraujo.store.grpc.ProductResponse.Builder;
import com.github.diegogomesaraujo.store.grpc.ShoppingServiceGrpc.ShoppingServiceImplBase;
import com.github.diegogomesaraujo.store.grpc.mappers.GRPCMapper;

import io.grpc.stub.StreamObserver;

@GRpcService
public class ShoppingService extends ShoppingServiceImplBase {

	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private CheckoutService checkoutService;

	@Autowired
	@Qualifier("product")
	private GRPCMapper<ProductRPC, Product> productMapper;
	
	@Override
	public void listProducts(PaginationRequest request, StreamObserver<ProductResponse> responseObserver) {
		int size = 10;
		
		if(request.getSize() > 0) {
			size = request.getSize();
		}
		
		Page<Product> products = productRepository.findAll(PageRequest.of(request.getPage(), size));
		
		Builder productResponse = ProductResponse.newBuilder();
		
		products.forEach(p -> productResponse.addProducts(productMapper.toRpc(p)));
		
		responseObserver.onNext(productResponse.build());
		responseObserver.onCompleted();
	}

	@Override
	public void checkout(PaymentRequest request, StreamObserver<MessageResponse> responseObserver) {
		// TODO Auto-generated method stub
		super.checkout(request, responseObserver);
	}

}
