package com.lti.entity;



import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="USER_BOOKING")
public class UserBooking {
	@Id
	@GenericGenerator(name = "hibernate_sequence", strategy = "sequence", parameters = {
            @org.hibernate.annotations.Parameter(name = "sequenceName", value = "sequence"),
            @org.hibernate.annotations.Parameter(name = "allocationSize", value = "1001"),
    })
    @GeneratedValue(generator = "sequence", strategy=GenerationType.SEQUENCE)
	@Column(name = "bk_id")
		private int bkId;
	
	@Column(name = "user_id")
	private int userId;
	
	@Column(name = "source")
	private String source;
	
	@Column(name = "destination")
	private String destination;
	
	@Column(name = "journey_date")
	private String journeyDate;
	
	@Column(name = "bk_seats")
	private int bkSeats;
	
	@Column(name = "total_price")
	private int totalPrice;
	
	@Column(name = "bus_sr_id")
	private  int busSrId;
	
	public int getBkId() {
		return bkId;
	}
	public void setBkId(int bkId) {
		this.bkId = bkId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
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
	
	public String getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(String journeyDate) {
		this.journeyDate = journeyDate;
	}
	public int getBkSeats() {
		return bkSeats;
	}
	public void setBkSeats(int bkSeats) {
		this.bkSeats = bkSeats;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getBusSrId() {
		return busSrId;
	}
	public void setBusSrId(int busSrId) {
		this.busSrId = busSrId;
	}

	

}
