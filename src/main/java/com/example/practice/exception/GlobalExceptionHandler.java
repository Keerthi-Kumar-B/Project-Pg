package com.example.practice.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	
	@ExceptionHandler(value = NodataFoundException.class)
	public ResponseEntity<?> handleException(NodataFoundException excFoundException) {
		ApiError error = new ApiError();
		error.setLocalDateTime(LocalDateTime.now());
		error.setMessage(excFoundException.getMessage());
		error.setClassName(excFoundException.getClass());
		return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
