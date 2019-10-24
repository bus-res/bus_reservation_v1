package com.lti.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lti.entity.Admin;
import com.lti.entity.Users;
import com.lti.service.UsersService;

@Controller
public class UsersController {

	
	@Autowired
	private UsersService usersService;
	
	@RequestMapping(path = "/userdetails.lti")
	public String fetchAll(Map model) {
		
		System.out.println("in controller");
		List<Users> list = usersService.fetchAll();
		model.put("listofusers", list);
		System.out.println(list);
		return "users.jsp";		
	}
}
