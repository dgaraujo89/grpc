package com.github.diegogomesaraujo.people.grpc.services;

import java.util.HashMap;
import java.util.Map;

import com.github.diegogomesaraujo.people.grpc.PeopleServiceGrpc.PeopleServiceImplBase;
import com.github.diegogomesaraujo.people.grpc.Person;
import com.github.diegogomesaraujo.people.grpc.PersonPhones;
import com.github.diegogomesaraujo.people.grpc.Response;
import com.google.protobuf.Empty;

import io.grpc.stub.StreamObserver;

public class PeopleImpl extends PeopleServiceImplBase {
	
	private final static Map<Long, Person> people = new HashMap<>();

	@Override
	public void sendPerson(Person person, StreamObserver<Response> responseObserver) {
		people.put(person.getId(), person);
		
		Response response = Response.newBuilder()
			.setMessage("A new person was created")
			.build();
		
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void listPeople(Empty request, StreamObserver<Person> responseObserver) {
		people.forEach((key, person) -> responseObserver.onNext(person));
		responseObserver.onCompleted();
	}

	@Override
	public void listPhonesByPerson(Person person, StreamObserver<PersonPhones> responseObserver) {
		PersonPhones personPhones = PersonPhones.newBuilder()
			.addAllPhones(people.get(person.getId()).getPhonesList())
			.build();
		
		responseObserver.onNext(personPhones);
		responseObserver.onCompleted();
	}

}
