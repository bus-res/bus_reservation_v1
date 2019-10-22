package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table (name = "BUS_DRIVER_DET")
public class Driver {
	
	

	@Id
	@GenericGenerator(name = "hibernate_sequence", strategy = "sequence", parameters = {
            @org.hibernate.annotations.Parameter(name = "sequenceName", value = "sequence"),
            @org.hibernate.annotations.Parameter(name = "allocationSize", value = "1001"),
    })
    @GeneratedValue(generator = "sequence", strategy=GenerationType.SEQUENCE)
	@Column(name = "bus_driver_id")
	private int driverId;
	
	
	@Column(name = "bus_driver_name")
	private String driverName;
	
	@Column(name = "license")
	private String license;
	
	@Column(name = "bus_driver_contact")
	private long contact;
	
	
	
	public int getDriverId() {
		return driverId;
	}
	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	
}
