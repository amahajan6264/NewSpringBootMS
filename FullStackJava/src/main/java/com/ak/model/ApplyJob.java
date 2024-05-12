package com.ak.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class ApplyJob {
	@Id
	@GeneratedValue
	private Integer id;
	private Integer jobId;
	private String name;
 	private String email;
	private Integer age;
	private String experience;
	private String address;
	private String country;
	private String state;
	private String village;
	private Integer pincode;
	private String resumePath;
}
