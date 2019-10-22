package com.lti.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.lti.entity.Route;
import com.lti.service.RouteService;


@Controller
public class RouteController {
	

	@Autowired
	private RouteService routeService;
	
	@RequestMapping(path = "/addroute.lti")
	//public String register(HttpServletRequest request) {
	//public String register(@RequestParam("name") String name, @RequestParam("email") String email, ...) {
	public String register(Route route) {
		routeService.register(route);
		return "routeconfirm.jsp";
	}
	
	@RequestMapping(path = "/searchroute.lti")
	//public String register(HttpServletRequest request) {
	//public String register(@RequestParam("name") String name, @RequestParam("email") String email, ...) {
	public String register(@RequestParam("source") String source, Map model) {
		Route route = routeService.get(source);
		model.put("route", route);
		return "routesearch.jsp";
	}

}
