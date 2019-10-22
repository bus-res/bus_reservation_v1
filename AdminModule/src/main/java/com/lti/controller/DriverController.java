package com.lti.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.lti.entity.Driver;
import com.lti.service.DriverService;

@Controller
public class DriverController {

	
	
	@Autowired
	private DriverService driverService;
	
	@RequestMapping(path = "/adddriver.lti")
	//public String register(HttpServletRequest request) {
	//public String register(@RequestParam("name") String name, @RequestParam("email") String email, ...) {
	public String register(Driver driver) {
		driverService.register(driver);
		return "driverconfirmation.jsp";
	}
	
	@RequestMapping(path = "/searchdriver.lti")
	//public String register(HttpServletRequest request) {
	//public String register(@RequestParam("name") String name, @RequestParam("email") String email, ...) {
	public String register(@RequestParam("license") String license, Map model) {
		Driver driver =driverService.get(license);
		model.put("driver", driver);
		return "driverprofile.jsp";
	}
	
	@RequestMapping(path = "/deletedriver.lti")
	//public String register(HttpServletRequest request) {
	//public String register(@RequestParam("name") String name, @RequestParam("email") String email, ...) {
	public String delete(@RequestParam("license") String license, Map model) {
		 driverService.delete(license);
		//model.remove("admin", admin);
		return "deletedriver.jsp";
	}
}
