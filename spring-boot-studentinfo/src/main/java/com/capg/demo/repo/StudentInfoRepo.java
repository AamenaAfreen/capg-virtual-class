package com.capg.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.demo.model.StudentInfo;

public interface StudentInfoRepo extends JpaRepository<StudentInfo, String> {

}
