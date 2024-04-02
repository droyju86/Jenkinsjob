package com.example.productsample.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class AppExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(ProductNotFoundException.class)
	
	public ResponseEntity<Object>handleProductNotFoundException(ProductNotFoundException ex,WebRequest request)
	{

	return new ResponseEntity<Object>(new ApiError(ex.getMessage(),HttpStatus.NOT_FOUND,LocalDateTime.now()),HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(EmptyInputException.class)
	public ResponseEntity<Object>handleEmptyInputException(EmptyInputException ex,WebRequest request)
	{

	return new ResponseEntity<Object>(new ApiError(ex.getMessage(),HttpStatus.BAD_REQUEST,LocalDateTime.now()),HttpStatus.BAD_REQUEST);
}
}