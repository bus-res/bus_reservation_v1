package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lti.dao.AdminDao;
import com.lti.entity.Admin;



@Service
public class AdminService {

	
	@Autowired
	private AdminDao adminDao;
	
	public void register(Admin admin) {
		adminDao.save(admin);
	}
	
	public Admin get(String numberPlate) {
		return adminDao.fetch(numberPlate);
	}
	
	public List<Admin> fetchAll(){
		return adminDao.fetchAll();
	}
}
