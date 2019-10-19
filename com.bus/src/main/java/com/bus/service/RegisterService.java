package com.bus.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.bus.entity.RegisterEntity;
import com.bus.model.RegistrationDao;

@Service 
public class RegisterService {


	@Autowired
	private RegistrationDao registerDao;
	
	public void register(RegisterEntity register) {
		 registerDao.save(register);
		
		
		//sending email code here
		}
	
}
