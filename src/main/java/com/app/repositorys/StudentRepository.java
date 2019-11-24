package com.app.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{

}
