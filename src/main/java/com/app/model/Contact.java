package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class Contact {
	@Id
	private Integer id;
	private String collegeName;
	private String email;
	private Integer phoneno;
	private String city;
	private String area;
	private Long pincode;

}
