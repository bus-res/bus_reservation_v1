package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Customer;

@Repository
public class CustomerDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void save(Customer customer) {
		//entityManager.persist(customer);
		entityManager.merge(customer);
	}
	
	public Customer fetch(String email) {
		String ql = "select c from Customer c where c.email = :em";
		Query q = entityManager.createQuery(ql);
		q.setParameter("em", email);
		return (Customer) q.getSingleResult();
	}
	
	public List<Customer> fetchAll() {
		String ql = "select c from Customer c";
		Query q = entityManager.createQuery(ql);
		return q.getResultList();
	}
}
