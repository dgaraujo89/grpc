package com.github.diegogomesaraujo.greeter.grpc.services;

import com.github.diegogomesaraujo.greeter.grpc.GreeterGrpc.GreeterImplBase;
import com.github.diegogomesaraujo.greeter.grpc.HelloReply;
import com.github.diegogomesaraujo.greeter.grpc.HelloRequest;

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
