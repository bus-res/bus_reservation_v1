package com.lti.controller;

mport java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.entity.Customer;
import com.lti.service.CustomerService;

@Controller
public class TicketController {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(path = "/TicketFinder.jsp");
}
