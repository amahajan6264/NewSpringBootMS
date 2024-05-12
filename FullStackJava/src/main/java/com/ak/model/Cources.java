package com.ak.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Cources {
	@Id
	@GeneratedValue
	private Integer courceId;
	private String courceName;	
}
