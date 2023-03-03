package com.example.practice.exception;


public class NodataFoundException extends RuntimeException {
	public NodataFoundException(String msg){
		super(msg);
	}
}
