package com.infy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infy.entities.Product;
import com.infy.repos.ProductRepo;
@RestController
public class ProductRestController {
	@Autowired
	ProductRepo repo;

	@PostMapping("/products/")
	public Product create(@RequestBody Product product) {
		return repo.save(product);
	}

	@PutMapping("/products/")
	public Product update(@RequestBody Product product) {
		return repo.save(product);
	}

	@DeleteMapping("/products/{id}")
	public void delete(@PathVariable("id") int id) {
		repo.deleteById(id);
	}

	@GetMapping("/products/{id}")
	public Product get(@PathVariable("id") int id) {
		return repo.findById(id).get();
	}

	@GetMapping("/products/")
	public List<Product> getlist() {
		return repo.findAll();
	}
}
