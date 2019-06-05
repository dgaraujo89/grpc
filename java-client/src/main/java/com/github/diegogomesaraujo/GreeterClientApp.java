package com.github.diegogomesaraujo;

import java.io.IOException;

import com.github.diegogomesaraujo.grpc.services.GreeterGrpc;
import com.github.diegogomesaraujo.grpc.services.GreeterGrpc.GreeterBlockingStub;
import com.github.diegogomesaraujo.grpc.services.GreeterGrpc.GreeterStub;
import com.github.diegogomesaraujo.grpc.services.HelloReply;
import com.github.diegogomesaraujo.grpc.services.HelloRequest;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GreeterClientApp {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		ManagedChannel channel = ManagedChannelBuilder.forAddress("127.0.0.1", 9000)
				.usePlaintext()
				.build();
		
		GreeterBlockingStub blockingStub = GreeterGrpc.newBlockingStub(channel);
		GreeterStub greeterStub = GreeterGrpc.newStub(channel);
		
		HelloRequest helloRequest = HelloRequest.newBuilder().setName("Diego").build();
		
		HelloReply reply = blockingStub.sayHello(helloRequest);
		
		System.out.println("Message: "+ reply.getMessage());
		
		channel.shutdown();
	}
	
}
