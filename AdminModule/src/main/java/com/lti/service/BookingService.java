package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.lti.dao.AdminDao;
import com.lti.dao.BookingDao;
import com.lti.entity.Admin;
import com.lti.entity.RegisterEntity;
import com.lti.entity.UserBooking;

import java.util.List;
import java.util.ListIterator;
import java.util.Map;
@Service
public class BookingService {

	@Autowired 
	private BookingDao bookingDao;
	
	public List<Admin> findbus(String so,String de) {
		  return bookingDao.findbus(so,de);
		
	}
	public int findbusId(String so,String de) {
		  return bookingDao.findbusId(so,de);
		
	}
	
	public void bookSeat(UserBooking userbk) {
		 bookingDao.bookSeat(userbk);
		
		}
	
	
	
}
