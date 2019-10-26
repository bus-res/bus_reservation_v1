package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaUpdate;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.*;

@Repository
public class ChangePasswordDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
		public void changepassword(String email, String contact,String password)
		{
			//System.out.println("in changepwd dao serv" +password);
			//String email="harshv";
			//Student student = new Student();
			String ql = "UPDATE RegisterEntity s SET s.password=:pwd WHERE s.email=:em AND s.contact=:cty";
			Query q = entityManager.createQuery(ql);
			q.setParameter("pwd", password);
			q.setParameter("em", email);
			q.setParameter("cty", contact);
			q.executeUpdate();
			System.out.println("Password changed");
		}
	
}
