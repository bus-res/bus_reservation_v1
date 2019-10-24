package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Admin;
import com.lti.entity.Route;

@Repository
public class RouteDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void save(Route route) {
		entityManager.merge(route);

	}
	
	

	public List<Route> fetch(String source) {
		String ql = "select route from Route route where route.source = :source";
		Query q = entityManager.createQuery(ql);
		q.setParameter("source", source);
		return q.getResultList();
	
	}

}
