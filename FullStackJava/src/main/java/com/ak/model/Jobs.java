package com.ak.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
public class Jobs {

	@Id
	@GeneratedValue
	private Long id;

	private String title;
	private String requirement;
	private String experience;
	private String description;
	private String location;
	private String department;
	private String deadline;
}
