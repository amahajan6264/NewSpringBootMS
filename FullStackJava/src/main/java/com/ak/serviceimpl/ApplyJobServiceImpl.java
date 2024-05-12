package com.ak.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ak.model.ApplyJob;
import com.ak.repository.ApplyJobRepo;
import com.ak.service.ApplyJobService;

@Service
public class ApplyJobServiceImpl implements ApplyJobService {

	@Autowired
	private ApplyJobRepo applyJobRepo;

	@Override
	public String applyJob(ApplyJob applyJob) {

		ApplyJob apply = applyJobRepo.save(applyJob);

		return "Application is sent successfully , Application Id : " + apply.getId();
	}

}
