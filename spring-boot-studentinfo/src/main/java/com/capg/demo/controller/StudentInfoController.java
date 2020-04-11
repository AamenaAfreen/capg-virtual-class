package com.capg.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.demo.model.StudentInfo;
import com.capg.demo.service.StudentInfoService;

@RestController
@RequestMapping("/info")
public class StudentInfoController {

	@Autowired
	StudentInfoService service;
	
	@GetMapping("/a")
	public String getMessage() {
		return "Hi";
	}
	
	 @PostMapping("/add")
	public ResponseEntity<StudentInfo> addStudent(@RequestBody StudentInfo student) {
		service.addStudent(student);
		return new ResponseEntity<StudentInfo>(student,HttpStatus.CREATED);
	}
	
	 @GetMapping("/SName/{SName}")
	public ResponseEntity<StudentInfo> getByStudentByName(@PathVariable("SName") String SName) {
		 StudentInfo student=service.getStudentByName(SName);
		return new ResponseEntity<StudentInfo>(student,HttpStatus.OK);
	 }
			
	@GetMapping("/all")
	 public ResponseEntity<List<StudentInfo>> getAllInfo(){
		 List<StudentInfo> allStudents= service.getAll();
		 return new ResponseEntity<List<StudentInfo>>(allStudents,HttpStatus.OK);
	 }		
	 @DeleteMapping("delete/SName/{SName}")
	 public ResponseEntity<Boolean> deleteInfo(@PathVariable("SName") String SName) {
	     return new ResponseEntity<Boolean>(service.deleteStudent(SName),HttpStatus.CREATED);
	 }
	 @PutMapping("/update")
	 public ResponseEntity<StudentInfo> updateInfo(@RequestBody StudentInfo newInfo) {
		 StudentInfo newStudentData= service.UpdateStudent(newInfo);
	     return new ResponseEntity<StudentInfo>(newStudentData,HttpStatus.ACCEPTED);
	 }
}
	

	
	
	
	 
	 
	 
	 
	 
	 
	 
	
		

