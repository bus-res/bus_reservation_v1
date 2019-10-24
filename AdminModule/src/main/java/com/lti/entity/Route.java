package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "ROUTE")
public class Route {
	

	@Id
	@GenericGenerator(name = "hibernate_sequence", strategy = "sequence", parameters = {
            @org.hibernate.annotations.Parameter(name = "sequenceName", value = "sequence"),
            @org.hibernate.annotations.Parameter(name = "allocationSize", value = "1001"),
    })
    @GeneratedValue(generator = "sequence", strategy=GenerationType.SEQUENCE)
	@Column(name = "ROUTE_ID")
	private int rid;
	
	
	@Column(name = "R_SOURCE")
	private String source;
	
	@Column(name = "R_DESTINATION")
	private String destination;
	
	@Column(name = "DISTANCE")
	private int distance;
	
	@Column(name = "PRICE_PER_SEAT")
	private int price;
	
	
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
}