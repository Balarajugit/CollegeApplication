package com.app.service;

import com.app.model.Home;

public interface IHomeService {
	
	public void saveHomeDetails(Home h);
	public Home getHomeDetails(Integer id);

}
