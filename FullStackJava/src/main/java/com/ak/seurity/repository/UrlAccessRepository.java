package com.ak.seurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ak.security.model.UrlAccess;

public interface UrlAccessRepository extends JpaRepository<UrlAccess, Long> {

}
