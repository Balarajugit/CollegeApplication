package com.app.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.model.Contact;
import com.app.repositorys.ContactRepository;
import com.app.service.IContactService;

@Service
public class ContactServiceImpl implements IContactService{
	@Autowired
	private ContactRepository repo;

	@Transactional
	public void saveContact(Contact c) {
		repo.save(c);
		
	}

	@Transactional(readOnly = true)
	public Contact getOneContact(Integer id) {
		Optional<Contact> con = repo.findById(id);
		if(con.isPresent()) {
			return con.get();
		}
		return null;
	}
	

}
