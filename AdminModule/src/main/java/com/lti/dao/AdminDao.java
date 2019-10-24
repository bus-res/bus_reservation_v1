package com.lti.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.lti.entity.Admin;



@Repository
public class AdminDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void save(Admin admin) {
		entityManager.merge(admin);

	}
	
	
	public Admin fetch(String numberPlate) {
		String ql = "select bus from Admin bus where bus.numberPlate = :np";
		Query q = entityManager.createQuery(ql);
		q.setParameter("np", numberPlate);
		return (Admin) q.getSingleResult();
	}
	
	@Transactional
	public void delete(String numberPlate) {
		Query q = entityManager.createQuery("delete Admin bus where bus.numberPlate = :np");
		q.setParameter("np", numberPlate);
		q.executeUpdate();
		
	}
	
	public List<Admin> fetchAll() {
		String ql = "select bus from Admin bus";
		Query q = entityManager.createQuery(ql);
		return q.getResultList();
	
	}

}

