package com.bus.model;
import com.bus.entity.*;

import java.sql.ResultSet;
import java.sql.SQLException;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import java.util.List;
import javax.persistence.Query;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;



@Repository
public  class RegistrationDao  {
	
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional                        //mainly used for dml 
	public void save(RegisterEntity register) {
		
		//entityManager.persist(customer);
		System.out.println(register.getFirstName());
		System.out.println(register.getContact());
		entityManager.merge(register);   //insert & update both
	}
	
	

//	public RegisterEntity mapRow(ResultSet resultSet, int rowNum) throws SQLException {
//		RegisterEntity register= new RegisterEntity();
//		register.setFirstName(resultSet.getString("first_name"));
//		register.setLastName(resultSet.getString("last_name"));
//		register.setEmail(resultSet.getString("email"));
//		register.setPassword(resultSet.getString("pswd"));
//		register.setContact(resultSet.getInt("contact"));
//		
//		return register;
//		}
	
	
	public List<RegisterEntity> fetchAll(){
		
		String ql="select r from RegisterEntity r";
		Query q=entityManager.createQuery(ql);
		return  q.getResultList();
	}
	
	
}
