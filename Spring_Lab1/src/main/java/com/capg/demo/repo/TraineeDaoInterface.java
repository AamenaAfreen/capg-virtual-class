package com.capg.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.demo.model.Trainee;

public interface TraineeDaoInterface extends JpaRepository<Trainee,Integer> {

}
