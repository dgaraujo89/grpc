package com.github.diegogomesaraujo.people.grpc.services;

import com.github.diegogomesaraujo.people.grpc.PeopleServiceGrpc.PeopleServiceImplBase;
import com.github.diegogomesaraujo.people.grpc.Person;
import com.github.diegogomesaraujo.people.grpc.PersonPhones;
import com.github.diegogomesaraujo.people.grpc.Response;
import com.google.protobuf.Empty;

import io.grpc.stub.StreamObserver;

public class PeopleImpl extends PeopleServiceImplBase {

	@Override
	public void sendPerson(Person request, StreamObserver<Response> responseObserver) {
		// TODO Auto-generated method stub
		super.sendPerson(request, responseObserver);
	}

	@Override
	public void listPeople(Empty request, StreamObserver<Person> responseObserver) {
		// TODO Auto-generated method stub
		super.listPeople(request, responseObserver);
	}

	@Override
	public void listPhonesByPerson(Person request, StreamObserver<PersonPhones> responseObserver) {
		// TODO Auto-generated method stub
		super.listPhonesByPerson(request, responseObserver);
	}

}
