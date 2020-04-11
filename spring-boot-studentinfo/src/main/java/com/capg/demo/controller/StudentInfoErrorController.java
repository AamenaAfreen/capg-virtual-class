package com.capg.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.capg.demo.exceptions.StudentNotFoundException;
import com.capg.demo.exceptions.StudentAlreadyExistException;
import com.capg.demo.exceptions.ListIsEmpty;

@ControllerAdvice
@RestController
public class StudentInfoErrorController {

	@ExceptionHandler(StudentNotFoundException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Student with this id is Not Found" , code = HttpStatus.NOT_FOUND)
	public void StudentNotFoundException() {
		
	}
	
	@ExceptionHandler(StudentAlreadyExistException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Student already exist " , code = HttpStatus.NOT_FOUND)
	public void StudentAlreadyExistException(){
		
	}
	
	@ExceptionHandler(ListIsEmpty.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "List Is Empty " , code = HttpStatus.NOT_FOUND)
	public void ListIsEmpty() {
		
	}
}
