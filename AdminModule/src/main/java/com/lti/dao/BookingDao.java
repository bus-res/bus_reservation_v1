package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.ModelAndView;

import com.lti.entity.Admin;
import com.lti.entity.RegisterEntity;
import com.lti.entity.Route;
import com.lti.entity.UserBooking;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

@Repository
public class BookingDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Transactional
	public int findbusId(String so,String de) {
		//System.out.println("in dao");
		
	  String ql2 = " select r.busSrId from Route r where r.source=:s and r.destination=:d";
		
		Query q2 = entityManager.createQuery(ql2);
		q2.setParameter("s", so);
	    q2.setParameter("d", de);
	    List<Route> rows  = q2.getResultList();
	    //System.out.println("in dao");
	   // System.out.println(rows);
	    Iterator i = rows.iterator();
	    
	  int x= (Integer) i.next();
	  
	  System.out.println(x);
	  return x;
	}
	
	
	@Transactional
	public List<Admin> findbus(String so,String de) {
		//System.out.println("in dao");
		 ModelAndView mav=new ModelAndView();
	
	  String ql2 = " select r.busSrId from Route r where r.source=:s and r.destination=:d";
		
		Query q2 = entityManager.createQuery(ql2);
		q2.setParameter("s", so);
	    q2.setParameter("d", de);
	    List<Route> rows  = q2.getResultList();
	 
	    Iterator i = rows.iterator();
	    
	  int x= (Integer) i.next();
	  
	  System.out.println(x);
	 
	mav.addObject("rows", rows);
	    String ql1 = " from Admin a where a.busId=:bi";
		Query q1 = entityManager.createQuery(ql1);
		q1.setParameter("bi", x);
		List<Admin> l = q1.getResultList();

	    System.out.println(l);
		
		return l;
		
		 
		  
	}
	

	@Transactional 
	public void bookSeat(UserBooking bkseat) {
		entityManager.merge(bkseat); 
	}
	
}
