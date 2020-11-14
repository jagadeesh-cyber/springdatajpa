package com.infy.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.entities.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
