package com.lti.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.lti.entity.Driver;

@Repository
public class DriverDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void save(Driver driver) {
		entityManager.merge(driver);

	}
	
	
	public Driver fetch(String license) {
		String ql = "select driver from Driver driver where driver.license = :license";
		Query q = entityManager.createQuery(ql);
		q.setParameter("license", license);
		return (Driver) q.getSingleResult();
	}
//	
	public List<Driver> fetchAll() {
		String ql = "select driver from Driver driver";
		Query q = entityManager.createQuery(ql);
		return q.getResultList();
	}
	
	@Transactional
	public void delete(String license) {
		Query q = entityManager.createQuery("delete Driver driver where driver.license = :license");
		q.setParameter("license", license);
		q.executeUpdate();
	}

}
