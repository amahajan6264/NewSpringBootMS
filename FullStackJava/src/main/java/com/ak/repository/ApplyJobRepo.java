package com.ak.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ak.model.ApplyJob;

public interface ApplyJobRepo extends JpaRepository<ApplyJob, Integer> {

}
