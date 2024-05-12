package com.ak.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AboutFormData")
public class AboutFormData {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String email;
	private String message;
	@Column(name = "view_message", columnDefinition = "NUMBER(1,0) DEFAULT 0")
	private Boolean viewMessage;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getViewMessage() {
		return viewMessage;
	}

	public void setViewMessage(Boolean viewMessage) {
		this.viewMessage = viewMessage;
	}

}
