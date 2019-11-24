package com.app.service;

import java.util.List;

import com.app.model.Student;

public interface IStudentService {
	
	public void saveStudentDetails(Student s);
	public Student getOneStudent(Integer id);
	public List<Student> getAllStudents();
	public void deleteStudent(Integer id);

}
