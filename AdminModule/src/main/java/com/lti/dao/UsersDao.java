package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Admin;
import com.lti.entity.Users;

@Repository
public class UsersDao {
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void save(Admin admin) {
		entityManager.merge(admin);

	}
	
	public List<Users> fetchAll() {
		System.out.println("in dao");
		String ql = " from Users";
		Query q = entityManager.createQuery(ql);
		return q.getResultList();
	
	}
}
