package com.example.productsample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.productsample.dao.ProductRepository;
import com.example.productsample.exception.EmptyInputException;
import com.example.productsample.exception.ProductNotFoundException;
import com.example.productsample.model.Product;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	
	public Product saveproduct(Product product)
	{
	
	if(product.getPrice()>0.0)
	{
	if(product.getName().isEmpty()||product.getName().length()==0||product.getCategory().isEmpty())
	{
		 throw new EmptyInputException("Input Fields are Empty");
				
	}
		
		return productRepository.save(product);
	}
	else
	{
		throw new EmptyInputException("Product Price should be greater than 0");
	}
	}
	     
	public List<Product> getProducts()
	{
		return productRepository.findAll();
		
	}
	public Product getProductById(int id)
	{
		return productRepository.findById(id).orElseThrow(()->new ProductNotFoundException("Prduct Not Found With Id"+id));
		
	}
	
}
