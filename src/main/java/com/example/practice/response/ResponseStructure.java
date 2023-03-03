package com.example.practice.response;

@lombok.Data
public class ResponseStructure<T> {

	T Data;
	String msg;
}
