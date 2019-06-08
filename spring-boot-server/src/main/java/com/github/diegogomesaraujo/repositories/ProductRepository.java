package com.github.diegogomesaraujo.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.github.diegogomesaraujo.documents.Product;

@Repository
public interface ProductRepository extends PagingAndSortingRepository<Product, String> {

}
