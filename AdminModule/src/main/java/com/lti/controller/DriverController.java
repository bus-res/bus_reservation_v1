package com.lti.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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
	public String delete(@RequestParam("license") String license,Model model) {
//		List<Driver> list = driverService.fetchAll();
//		System.out.println(list);
//		System.out.println(license);
//		String msg="";
//		for(Driver d:list) {
//			if(d.getLicense().equals(license)) {
			 driverService.delete(license);
//			System.out.println(d.getLicense());}
//			else {
//				model.addAttribute("msg", "Invalid licence");
//			}
//		}
		
		//model.remove("admin", admin);
		return "deletedriver.jsp";
	}
	
	
//	----------------------------------------------------------------------Just checking
	
	
	@RequestMapping(path = "/driverdetails.lti")
	public String fetchAll(Map model) {
		List<Driver> list = driverService.fetchAll();
		model.put("listofdrivers", list);
		return "driverdetails.jsp";		
	}
	
	}
	

