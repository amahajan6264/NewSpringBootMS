package com.ak.service;

import java.util.Optional;

import com.ak.model.AboutFormData;

public interface AboutFormService {

	public AboutFormData saveFormData(AboutFormData aboutFormData);

	public String checkFormStatus(Integer id);
}
