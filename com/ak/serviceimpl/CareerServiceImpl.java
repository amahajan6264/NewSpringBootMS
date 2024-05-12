package com.ak.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ak.model.Jobs;
import com.ak.repository.CareerRepo;
import com.ak.service.CareerService;

@Service
public class CareerServiceImpl implements CareerService {
	
	@Autowired
	private CareerRepo careerRepo;
	
	/* Get all the job from db */
	@Override
	public List<Jobs> getAllJobs(){
		return careerRepo.findAll();
	}
	
	
}
