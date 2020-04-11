package com.capg.demo.exceptions;

public class StudentAlreadyExistException extends RuntimeException{

	public StudentAlreadyExistException(String msg) {
		super(msg);
	}
}
