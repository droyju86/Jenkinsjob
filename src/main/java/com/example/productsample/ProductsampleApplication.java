package com.example.productsample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductsampleApplication implements CommandLineRunner{

	public static final  Logger logger=LoggerFactory.getLogger(ProductsampleApplication.class);
	public static void main(String[] args) {
		logger.info("its a continuous integration job");
		SpringApplication.run(ProductsampleApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		logger.info("its my second logger");
	}

}
