package com.github.diegogomesaraujo;

import java.io.IOException;

import com.github.diegogomesaraujo.greeter.grpc.services.GreeterImpl;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class App {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		Server server = ServerBuilder.forPort(9000)
			.addService(new GreeterImpl())
			.build();
		
		server.start();
		
		System.out.println("Server started...");
		
		server.awaitTermination();
	}
	
}
