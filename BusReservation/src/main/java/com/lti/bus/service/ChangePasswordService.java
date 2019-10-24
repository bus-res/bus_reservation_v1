package com.lti.bus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.bus.dao.*;
import com.lti.bus.entity.*;

@Service
public class ChangePasswordService {

	@Autowired
	private ChangePasswordDao changePasswordDao;
	
	public void changepassword(String email, String contact, String password)
	{
		changePasswordDao.changepassword(email,contact,password);
	}
	
	
}
