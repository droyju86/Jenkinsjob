package com.example.productsample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.productsample.dao.ProductRepository;
import com.example.productsample.model.Product;
import com.example.productsample.service.ProductService;


@RestController
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@PostMapping("/saveProduct")
	public ResponseEntity<Product> saveProduct(@RequestBody Product product)
	{
		Product productsaved= productService.saveproduct(product);	
		return new ResponseEntity<Product>(productsaved,HttpStatus.CREATED);
	}

	@GetMapping("/getProducts")
	public List<Product> getAllProducts() 
	{
	
	return productService.getProducts();
	}
	
	@GetMapping("/getProduct/{id}")
	public Product getProductById(@PathVariable int id)
	{
	
		return productService.getProductById(id);
	}
}