package com.github.diegogomesaraujo;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import com.github.diegogomesaraujo.greeter.GreeterClient;
import com.github.diegogomesaraujo.people.PeopleClient;
import com.github.diegogomesaraujo.people.grpc.Person;
import com.github.diegogomesaraujo.people.grpc.Phone;
import com.github.diegogomesaraujo.people.grpc.PhoneType;

public class App {
	
	private final static String SERVER_HOST = "localhost";
	
	private final static Integer SERVER_PORT = 9000; 
			
	
	public static void main(String[] args) throws InterruptedException {
		Long startTime = System.nanoTime();
		
		sayHello();
		savePerson();
		listPhonesByPerson();
		
		Long endTime = System.nanoTime();
		
		Long timeElapsed = endTime - startTime;

		System.out.println("Execution time in milliseconds : " + (timeElapsed / 1000000));
	}
	
	private static void sayHello() throws InterruptedException {
		GreeterClient greeterClient = new GreeterClient(SERVER_HOST, SERVER_PORT);
		String message = greeterClient.sayHello("Diego");
		greeterClient.shutdown();
		
		System.out.printf("Message: %s%n", message);
	}
	
	private static void savePerson() {
		Person person = Person.newBuilder()
				.setId(ThreadLocalRandom.current().nextLong(100))
				.setName("Diego")
				.setEmail("diego@grpc.com")
				.setAge(30)
				.addPhones(Phone.newBuilder()
						.setType(PhoneType.MOBILE)
						.setNumber("+5511985659875")
						.build())
				.addPhones(Phone.newBuilder()
						.setType(PhoneType.WORK)
						.setNumber("+551132568741")
						.build())
				.build();
		
		PeopleClient peopleClient = new PeopleClient(SERVER_HOST, SERVER_PORT);
		String message = peopleClient.save(person);
		peopleClient.shutdown();
		
		System.out.println("Message: "+ message);
	}
	
	private static void listPhonesByPerson() {
		PeopleClient peopleClient = new PeopleClient(SERVER_HOST, SERVER_PORT);
		List<Person> people = peopleClient.listPeople();
		
		
		people.forEach(p -> {
			System.out.printf("Id: %d, Name: %s%n", p.getId(), p.getName());
			
			List<Phone> phones = peopleClient.listPhonesByPerson(p);
			
			phones.forEach(phone -> System.out.printf("\tType: %s, Number: %s%n", phone.getType(), phone.getNumber()));
		});
		
		peopleClient.shutdown();
	}
	
}
