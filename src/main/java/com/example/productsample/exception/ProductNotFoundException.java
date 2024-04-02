package com.example.productsample.exception;

public class ProductNotFoundException extends RuntimeException{
public ProductNotFoundException(String msg)
{
	super(msg);
}
}
