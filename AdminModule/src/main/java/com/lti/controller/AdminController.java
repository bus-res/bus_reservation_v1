package com.lti.controller;

import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.dao.AdminDao;
import com.lti.entity.Admin;
import com.lti.entity.Driver;
import com.lti.service.AdminService;


@Controller
public class AdminController {
	
	
	@Autowired
	private AdminService adminService;
	
	@RequestMapping(path = "/addbus.lti")
	//public String register(HttpServletRequest request) {
	//public String register(@RequestParam("name") String name, @RequestParam("email") String email, ...) {
	public String register(Admin admin) {
		adminService.register(admin);
		return "confirmation.jsp";
	}
	
	@RequestMapping(path = "/search.lti")
	//public String register(HttpServletRequest request) {
	//public String register(@RequestParam("name") String name, @RequestParam("email") String email, ...) {
	public String register(@RequestParam("numberPlate") String numberPlate, Map model) {
		Admin admin = adminService.get(numberPlate);
		model.put("admin", admin);
		return "profile.jsp";
	}
//	
//	@RequestMapping(value = "/getbuses.lti")
//    public List<Admin> fetchAll(Model model)
//    {
//		ListIterator<String>  li= .li();
////		return adminService.fetchAll();
////        List<Admin> admin = adminService.fetchAll();
////        model.addAttribute("admin", admin);
//       return "buses.jsp";
//    }
	
	@RequestMapping(path = "/deletebus.lti")
	//public String register(HttpServletRequest request) {
	//public String register(@RequestParam("name") String name, @RequestParam("email") String email, ...) {
	public String delete(@RequestParam("numberPlate") String numberPlate, Map model) {
		 adminService.delete(numberPlate);
//		model.add("admin", admin);
		return "deletebus.jsp";
	}
	
	
	@RequestMapping(path = "/busdetails.lti")
	public String fetchAll(Map model) {
		List<Admin> list = adminService.fetchAll();
		model.put("listofbuses", list);
		return "buses.jsp";		
	}
}
