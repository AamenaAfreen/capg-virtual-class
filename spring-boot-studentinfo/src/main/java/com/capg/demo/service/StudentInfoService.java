package com.capg.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.demo.exceptions.ListIsEmpty;
import com.capg.demo.exceptions.StudentAlreadyExistException;
import com.capg.demo.exceptions.StudentNotFoundException;
import com.capg.demo.model.StudentInfo;
import com.capg.demo.repo.StudentInfoRepo;


@Service
public class StudentInfoService {
	
	@Autowired(required=true)
	StudentInfoRepo repo;
	
	
	public StudentInfo addStudent(StudentInfo student) {
		if(repo.existsById(student.getStudentName())) {
			throw new StudentAlreadyExistException("Student with name : ["+student.getStudentName()+"] already exist");
		}
		return repo.save(student);
	}
    
	public StudentInfo getStudentByName(String studentName) {
			if(!repo.existsById(studentName)) {
			throw new StudentNotFoundException("Student with name : ["+studentName+"] Not Found");
		}
			return repo.getOne(studentName);
	}
    
    public List<StudentInfo> getAll(){
    	if(repo.findAll().isEmpty()) {
    		throw new ListIsEmpty("List is empty");
    	}
    	
    	return repo.findAll();
    }
   
    public boolean deleteStudent(String studentName) {
    	if(!repo.existsById(studentName)) {
    		throw new StudentNotFoundException("Student with name : ["+studentName+"] does not exist");
    	}
    		
    	repo.deleteById(studentName);
    	return !(repo.existsById(studentName));
    }

	public StudentInfo UpdateStudent(StudentInfo newInfo) {
		// TODO Auto-generated method stub
		
		StudentInfo oldInfo=repo.getOne(newInfo.getStudentName());
		oldInfo.setStudentId(newInfo.getStudentId());
		oldInfo.setDob(newInfo.getDob());
		
		return repo.save(oldInfo);
	}

    
}
