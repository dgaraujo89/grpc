package com.github.diegogomesaraujo.gretter;

import java.util.concurrent.TimeUnit;

import com.github.diegogomesaraujo.gretter.grpc.services.GreeterGrpc;
import com.github.diegogomesaraujo.gretter.grpc.services.HelloReply;
import com.github.diegogomesaraujo.gretter.grpc.services.HelloRequest;
import com.github.diegogomesaraujo.gretter.grpc.services.GreeterGrpc.GreeterBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GreeterClient {

	private ManagedChannel channel;
	
	private GreeterBlockingStub blockingStub;
	
	public GreeterClient(String host, Integer port) {
		this.channel = ManagedChannelBuilder.forAddress(host, port)
				.usePlaintext()
				.build();
		
		this.blockingStub = GreeterGrpc.newBlockingStub(channel);
	}
	
	public String sayHello(String name) {
		HelloRequest helloRequest = HelloRequest.newBuilder().setName("Diego").build();
		HelloReply reply = blockingStub.sayHello(helloRequest);
		return reply.getMessage();
	}
	
	public void shutdown() throws InterruptedException {
		channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
	}
	
}
