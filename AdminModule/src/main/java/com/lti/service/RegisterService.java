package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.lti.dao.RegistrationDao;
import com.lti.entity.RegisterEntity;


@Service 
public class RegisterService {


	@Autowired
	private RegistrationDao registerDao;
	
	public void register(RegisterEntity register) {
		 registerDao.save(register);
		
		}

	public RegisterEntity get(String email, String password) {
		return registerDao.fetch(email, password);
	}
	/*public RegisterEntity getName(String firstName) {
		return registerDao.fetchName(firstName);}*/
}

