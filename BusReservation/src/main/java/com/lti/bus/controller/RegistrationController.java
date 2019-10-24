package com.lti.bus.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.bus.entity.*;
import com.lti.bus.service.ChangePasswordService;
import com.lti.bus.service.RegisterService;
import com.mail.Sendmail;


@Controller
public class RegistrationController {

	
	@Resource
	private ChangePasswordService changePasswordService;
	
	@Autowired
	private RegisterService registerService;
//registration
	@RequestMapping(path="/registration.bus")
public String register(RegisterEntity register) {
	registerService.register(register);
		return "homepage.jsp";
	}
	//profile
	@RequestMapping(path="/profile.bus")
	public String registerp(RegisterEntity register) {
		registerService.register(register);
			return "profile.jsp";
		}
	//login
	@RequestMapping(path = "/login.bus")
	//public String register(@RequestParam("name") String name, @RequestParam("email") String email, ...) {
	public String registration(@RequestParam("email") String email, @RequestParam("password") String password,  Map model) {
		RegisterEntity register = registerService.get(email, password);
		model.put("register", register);
		return "homepage.jsp";
		
	}
	
	
	//send mail
	@RequestMapping(path = "/sendmail.bus")
	public String mail(@RequestParam("email") String email) 
	{
		Sendmail sendmail = new Sendmail();
		sendmail.sendmail(email);
		return "reset.jsp";
	}
	
	//change password
	@RequestMapping(path = "/changepwd.bus")
	public String change(@RequestParam("email") String email, @RequestParam("contact") String contact, @RequestParam("password") String password) 
	{
		changePasswordService.changepassword(email,contact,password);
		return "success.jsp";
	}
	
}
	
