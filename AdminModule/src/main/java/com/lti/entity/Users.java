package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table (name = "AUTH_USER")
public class Users {

	
	

	@Id
	@GenericGenerator(name = "hibernate_sequence", strategy = "sequence", parameters = {
            @org.hibernate.annotations.Parameter(name = "sequenceName", value = "sequence"),
            @org.hibernate.annotations.Parameter(name = "allocationSize", value = "1001"),
    })
	
	 @GeneratedValue(generator = "sequence", strategy=GenerationType.SEQUENCE)
		@Column(name = "user_id")
	private int userId;
	
	
	@Column(name="firstname")
	private String fName;
	
	
	@Column(name="lastname")
	private String lName;
	
	@Column(name="email")
	private String email;
	
	
	
	

	@Column(name="contact")
	private long contact;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}
	
	
}
