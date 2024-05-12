package com.ak.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ak.model.Cources;

public interface CourcesRepo extends JpaRepository<Cources, Integer> {
	
}
