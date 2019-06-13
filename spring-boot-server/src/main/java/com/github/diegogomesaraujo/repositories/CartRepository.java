package com.github.diegogomesaraujo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.github.diegogomesaraujo.redis.Cart;

@Repository
public interface CartRepository extends CrudRepository<Cart, String> {

}
