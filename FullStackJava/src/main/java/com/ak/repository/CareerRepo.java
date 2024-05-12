package com.ak.repository;

import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ak.model.Jobs;

public interface CareerRepo extends JpaRepository<Jobs, Long> {

	
}
