package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class Home {
	@Id
	@GeneratedValue
	private Integer id;
	private String desc1;
	private String desc2;
	private String desc3;

}
