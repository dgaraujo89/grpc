package com.github.diegogomesaraujo.greeter;

import java.util.concurrent.TimeUnit;

import com.github.diegogomesaraujo.greeter.grpc.GreeterGrpc;
import com.github.diegogomesaraujo.greeter.grpc.GreeterGrpc.GreeterBlockingStub;
import com.github.diegogomesaraujo.greeter.grpc.HelloReply;
import com.github.diegogomesaraujo.greeter.grpc.HelloRequest;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GreeterClient {

	private ManagedChannel channel;
	
	private GreeterBlockingStub blockingStub;
	
	public GreeterClient(String host, Integer port) {
		channel = ManagedChannelBuilder.forAddress(host, port)
				.usePlaintext()
				.build();
		
		blockingStub = GreeterGrpc.newBlockingStub(channel);
	}
	
	public String sayHello(String name) {
		HelloRequest helloRequest = HelloRequest.newBuilder().setName(name).build();
		HelloReply reply = blockingStub.sayHello(helloRequest);
		return reply.getMessage();
	}
	
	public void shutdown() throws InterruptedException {
		channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
	}
	
}
