package com.ak.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ak.model.AboutFormData;
import com.ak.repository.AboutRepo;
import com.ak.service.AboutFormService;

@Service
public class AboutFormDataServiceImpl implements AboutFormService {

	@Autowired
	private AboutRepo aboutRepo;

	/* save the about form data into db */
	@Override
	public AboutFormData saveFormData(AboutFormData aboutFormData) {
		return aboutRepo.save(aboutFormData);
	}

	/* get the about form detail status */
	@Override
	public String checkFormStatus(Integer id) {
		Optional<AboutFormData> data = aboutRepo.findById(id);
		if (data.isEmpty()) {
			return "Record Not Found Please Enter The Correct Id";
		} else {
			AboutFormData aboutFormData = data.get();
			String view = aboutFormData.getId() + " : " + aboutFormData.getViewMessage();
			return view;
		}

	}

}
