package com.app.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer>{

}
