package com.lti.bus.dao;
import java.sql.ResultSet;
import java.sql.SQLException;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import java.util.List;
import javax.persistence.Query;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.lti.bus.entity.*;



@Repository
public  class RegistrationDao  {
	
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional                        //mainly used for dml 
	public void save(RegisterEntity register) {
		
		//entityManager.persist(customer);
		//System.out.println(register.getFirstName());
		//System.out.println(register.getContact());
		entityManager.merge(register);   //insert & update both
	}
	//for login
	public RegisterEntity fetch(String email, String password) {
		String ql = "select r from RegisterEntity r where r.email = :em and r.password= :pwd";
		Query q = entityManager.createQuery(ql);
		q.setParameter("em", email);
		q.setParameter("pwd", password);
		//System.out.println(email);
		return (RegisterEntity) q.getSingleResult();
	}	
	
	
	public RegisterEntity fetchName(String firstName) {
		String ql = "select r from RegisterEntity r where r.efirstname= :firstname";
		Query q = entityManager.createQuery(ql);
		q.setParameter("firstname", firstName);
		/*RegisterEntity re = new RegisterEntity();
		String name = re.getFirstName()+re.getLastName();*/
//		q.setParameter("pwd", password);
		//System.out.println(email);
		return (RegisterEntity) q.getSingleResult();
	}	
	//for registration
	public List<RegisterEntity> fetchAll(){
		
		String ql="select r from RegisterEntity r";
		Query q=entityManager.createQuery(ql);
		
		return  q.getResultList();
	}
	
	
}
