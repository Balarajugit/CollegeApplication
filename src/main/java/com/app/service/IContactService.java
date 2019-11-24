package com.app.service;


import com.app.model.Contact;

public interface IContactService {
	
	public void saveContact(Contact c);
	public Contact getOneContact(Integer id);

}
