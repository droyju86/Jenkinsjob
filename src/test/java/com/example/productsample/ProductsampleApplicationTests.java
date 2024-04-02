package com.example.productsample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductsampleApplicationTests {
	public static final  Logger logger=LoggerFactory.getLogger(ProductsampleApplicationTests .class);

	@Test
	void contextLoads() {
		logger.info("its my test class");
		assertEquals(true, true);
		
	}

}
