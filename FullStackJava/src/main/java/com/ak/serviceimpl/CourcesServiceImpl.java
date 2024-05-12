package com.ak.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ak.model.Cources;
import com.ak.repository.CourcesRepo;
import com.ak.service.CourcesService;

@Service
public class CourcesServiceImpl implements CourcesService {

	@Autowired
	private CourcesRepo courcesRepo;

	@Override
	public List<Cources> getCources() {
		return courcesRepo.findAll();
	}

}
