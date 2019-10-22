package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.AdminDao;
import com.lti.dao.DriverDao;
import com.lti.entity.Admin;
import com.lti.entity.Driver;

@Service
public class DriverService {


	@Autowired
	private DriverDao driverDao;
	
	public void register(Driver driver) {
		driverDao.save(driver);
	}
	
	public Driver get(String license) {
		return driverDao.fetch(license);
	}
	
	public void delete(String license) {
		 driverDao.delete(license);
		System.out.println("Delete Method called");
	}
	

}
