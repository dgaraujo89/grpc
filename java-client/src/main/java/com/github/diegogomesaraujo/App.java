package com.github.diegogomesaraujo;

import com.github.diegogomesaraujo.gretter.GreeterClient;

public class App {
	
	public static void main(String[] args) throws InterruptedException {
		sayHello();
	}
	
	private static void sayHello() throws InterruptedException {
		GreeterClient greeterClient = new GreeterClient("localhost", 9000);
		String message = greeterClient.sayHello("Diego");
		greeterClient.shutdown();
		
		System.out.printf("Message: %s%n", message);
	}
	
}
