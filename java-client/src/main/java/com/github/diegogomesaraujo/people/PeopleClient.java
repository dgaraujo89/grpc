package com.github.diegogomesaraujo.people;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.github.diegogomesaraujo.people.grpc.PeopleServiceGrpc;
import com.github.diegogomesaraujo.people.grpc.PeopleServiceGrpc.PeopleServiceBlockingStub;
import com.github.diegogomesaraujo.people.grpc.Person;
import com.github.diegogomesaraujo.people.grpc.PersonPhones;
import com.github.diegogomesaraujo.people.grpc.Phone;
import com.github.diegogomesaraujo.people.grpc.Response;
import com.google.protobuf.Empty;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class PeopleClient {

	private ManagedChannel channel;
	
	private PeopleServiceBlockingStub blockingStub;
	
	public PeopleClient(String host, Integer port) {
		channel = ManagedChannelBuilder.forAddress(host, port).build();
		
		blockingStub = PeopleServiceGrpc.newBlockingStub(channel);
	}
	
	public String save(Person person) {
		Response response = blockingStub.sendPerson(person);
		return response.getMessage();
	}
	
	public List<Person> listPeople() {
		List<Person> people = new ArrayList<>();
		
		Iterator<Person> peopleStream = blockingStub.listPeople(Empty.getDefaultInstance());
		
		while(peopleStream.hasNext()) {
			people.add(peopleStream.next());
		}
		
		return people;
	}
	
	public List<Phone> listPhonesByPerson(Person person) {
		PersonPhones personPhones = blockingStub.listPhonesByPerson(person);
		return personPhones.getPhonesList();
	}
	
	public void shutdown() {
		channel.shutdownNow();
	}
	
}
