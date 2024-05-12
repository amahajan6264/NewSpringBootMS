package com.ak.serviceimpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ak.model.Jobs;
import com.ak.repository.CareerRepo;
import com.ak.service.CareerService;

@Service
public class CareerServiceImpl implements CareerService {
	
	private static final Logger log=LoggerFactory.getLogger(CareerServiceImpl.class);
	@Autowired
	private CareerRepo careerRepo;
	
	/* Get all the job from db */
	@Override
	public List<Jobs> getAllJobs(){
		log.debug("careerService get");
		return careerRepo.findAll();
	}
	
	
}
