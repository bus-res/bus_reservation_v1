package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Customer;

@Repository
public class TicketDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void save(Ticket ticket) {
		//entityManager.persist(ticket);
		entityManager.merge(ticket);
	}
	
	public Ticket fetch(String email) {
		String ql = "select c from Customer c where c.email = :em";
		Query q = entityManager.createQuery(ql);
		q.setParameter("em", email);
		return (Customer) q.getSingleResult();
	}
	
	public List<Route> fetchAll() {
		String ql = "select r from Routes r";
		Query q = entityManager.createQuery(ql);
		return q.getResultList();
	}
}