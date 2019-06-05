package com.github.diegogomesaraujo.grpc.services;

import com.github.diegogomesaraujo.grpc.HelloReply;
import com.github.diegogomesaraujo.grpc.HelloRequest;
import com.github.diegogomesaraujo.grpc.GreeterGrpc.GreeterImplBase;

import io.grpc.stub.StreamObserver;

public class GreeterImpl extends GreeterImplBase {

	@Override
	public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
		HelloReply reply = HelloReply
				.newBuilder()
					.setMessage("Hello "+ request.getName())
				.build();
		
		System.out.println("SayHello service was called");
		
		responseObserver.onNext(reply);
		responseObserver.onCompleted();
	}
	
}
