package com.github.diegogomesaraujo.store.grpc.mappers;

public interface GRPCMapper <T, E> {

	T toRpc(E entity);
	
	E fromRpc(T entityRpc);
	
}
