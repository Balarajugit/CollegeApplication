package com.app.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.model.Home;
import com.app.repositorys.HomeRepository;
import com.app.service.IHomeService;
@Service
public class HomeServiceImpl implements IHomeService {
	
	@Autowired
	private HomeRepository hRepo;

	@Transactional
	public void saveHomeDetails(Home h) {
		hRepo.save(h);
		
	}

	@Transactional(readOnly = true)
	public Home getHomeDetails(Integer id) {
		Optional<Home> home = hRepo.findById(id);
		if(home.isPresent()) {
			return home.get();
		}
				return null;
			}
	

}
