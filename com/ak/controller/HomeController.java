package com.ak.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ak.model.AboutFormData;
import com.ak.model.Jobs;
import com.ak.repository.CareerRepo;
import com.ak.repository.LocationDaoImpl;
import com.ak.service.AboutFormService;
import com.ak.service.CareerService;

@RestController
@RequestMapping("/api")
public class HomeController {

	/* ======================= About form ========================= */
	@Autowired
	private AboutFormService aboutFormService;

	@PostMapping(value = "/saveAboutFormData")
	public ResponseEntity<Integer> postMethodName(@RequestBody AboutFormData aboutFormData) {
		return new ResponseEntity<>(aboutFormService.saveFormData(aboutFormData).getId(), HttpStatus.OK);
	}

	@GetMapping(value = "/getFormData/{id}")
	public ResponseEntity<String> checkFormDataStatus(@PathVariable(value = "id") Integer id) {
		return new ResponseEntity<>(aboutFormService.checkFormStatus(id), HttpStatus.OK);
	}

	/* ======================= Career ========================= */
	@Autowired
	private CareerService careerService;
	@Autowired
	private CareerRepo careerRepo;
	@Autowired
	private LocationDaoImpl locationDaoImpl;

	@GetMapping(value = "/jobs")
	public ResponseEntity<List<Jobs>> getAllJobs() {
		List<Jobs> jobs = careerService.getAllJobs();
		if (jobs.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<>(jobs, HttpStatus.OK);
		}
	}

	@GetMapping(value = "/country")
	public ResponseEntity<Map<Integer, String>> getCountry() {
		return new ResponseEntity<>(locationDaoImpl.getCountry(), HttpStatus.OK);
	}

	@GetMapping(value = "/state/{stateId}")
	public ResponseEntity<Map<Integer, String>> getState(@PathVariable("stateId") Integer id) {
		return new ResponseEntity<>(locationDaoImpl.getState(id), HttpStatus.OK);
	}

	@GetMapping(value = "/city/{cityId}")
	public ResponseEntity<Map<Integer, String>> getCity(@PathVariable("cityId") Integer id) {
		return new ResponseEntity<>(locationDaoImpl.getCity(id), HttpStatus.OK);
	}

	@GetMapping(value = "/village/{villageId}")
	public ResponseEntity<Map<Integer, String>> getVillage(@PathVariable("villageId") Integer id) {
		return new ResponseEntity<>(locationDaoImpl.getVillage(id), HttpStatus.OK);
	}

}
