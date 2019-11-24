package com.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.model.Student;
import com.app.repositorys.StudentRepository;
import com.app.service.IStudentService;
@Service
public class StudentServiceImpl implements IStudentService {
	@Autowired
	private StudentRepository repo;

	@Transactional
	public void saveStudentDetails(Student s) {
		repo.save(s);
		
	}

	@Transactional(readOnly = true)
	public Student getOneStudent(Integer id) {
		Optional<Student> stu = repo.findById(id);
		if(stu.isPresent()) {
			return stu.get();
		}
		return null;
	}

	@Transactional(readOnly = true)
	public List<Student> getAllStudents() {

		return repo.findAll();
	}

	@Transactional
	public void deleteStudent(Integer id) {
		repo.deleteById(id);
		
	}

}
