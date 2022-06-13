package com.praveenp.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.praveenp.application.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	Product findByName(String name);

}

//create second 2