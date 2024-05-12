package com.ak.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ak.model.AboutFormData;



public interface AboutRepo extends JpaRepository<AboutFormData, Integer> {

}
