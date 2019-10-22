package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.CustomerDao;
import com.lti.entity.Customer;

@Service
public class CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	public void register(Customer customer) {
		customerDao.save(customer);
		//sending email code here
	}
	
	public Customer get(String email) {
		return customerDao.fetch(email);
	}
	
}
