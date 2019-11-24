package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class Student {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String gender;
	private String degree;
	private String branch;
	private String rooNo;
	private Long phoneno;
	private String email;

}
