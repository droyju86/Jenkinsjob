package com.example.productsample.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.productsample.model.Product;


public interface ProductRepository extends JpaRepository<Product, Integer> {

	//List<Product> findbycategory(String category);

}

