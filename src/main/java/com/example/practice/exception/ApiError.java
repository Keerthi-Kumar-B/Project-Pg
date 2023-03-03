package com.example.practice.exception;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ApiError {
	private LocalDateTime localDateTime;
	private String message;
	private Class<?> className;
}
