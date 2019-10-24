package com.lti.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.entity.Driver;
import com.lti.entity.Route;
import com.lti.service.RouteService;


@Controller
public class RouteController {
	

	@Autowired
	private RouteService routeService;
	
	@RequestMapping(path = "/addroute.lti")
	
	public String register(Route route) {
		routeService.register(route);
		return "routeconfirm.jsp";
	}
	
	@RequestMapping(path = "/searchroute.lti")

	public String register(@RequestParam("source") String source, Map model) {
		List<Route> list = routeService.fetch(source);
		model.put("listofroutes", list);
		return "routesearch.jsp";
	}
	
	
}
