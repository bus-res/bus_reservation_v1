package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.lti.dao.UsersDao;
import com.lti.entity.Admin;
import com.lti.entity.Users;

@Service
public class UsersService {

	
	@Autowired
	private UsersDao usersDao;
	public void register(Admin admin) {
		usersDao.save(admin);
	}
	
	public List<Users> fetchAll(){
		System.out.println("in service");
		return usersDao.fetchAll();
	}
	
}
