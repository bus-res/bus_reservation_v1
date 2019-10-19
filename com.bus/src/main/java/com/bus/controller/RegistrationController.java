package com.bus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bus.entity.*;
import com.bus.service.RegisterService;

@Controller
public class RegistrationController {

	@Autowired
	private RegisterService registerService;

	@RequestMapping(path="/registration.lti")
public String register(RegisterEntity register) {
		
	registerService.register(register);
		return "homepage.jsp";
		
	}
	
}
