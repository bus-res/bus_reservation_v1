package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.AdminDao;
import com.lti.dao.RouteDao;
import com.lti.entity.Admin;
import com.lti.entity.Route;

@Service
public class RouteService {
	

	@Autowired
	private RouteDao routeDao;
	
	public void register(Route route) {
		routeDao.save(route);
	}
	
	public List<Route> fetch(String source){
		return routeDao.fetch(source);
	}
//	
//	public List<Admin> fetchAll(){
//		return adminDao.fetchAll();
//	}

}
