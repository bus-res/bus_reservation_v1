package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ROUTE")

public class Route {
	@Id
	@GeneratedValue
	
private String R_Source;
private String R_Destination;
private int Distance;
private int Price_Per_Seat;
private int Bus_Sr_id;

public String getR_Source() {
	return R_Source;
}
public void setR_Source(String r_Source) {
	R_Source = r_Source;
}
public String getR_Destination() {
	return R_Destination;
}
public void setR_Destination(String r_Destination) {
	R_Destination = r_Destination;
}
public int getDistance() {
	return Distance;
}
public void setDistance(int distance) {
	Distance = distance;
}
public int getPrice_Per_Seat() {
	return Price_Per_Seat;
}
public void setPrice_Per_Seat(int price_Per_Seat) {
	Price_Per_Seat = price_Per_Seat;
}
public int getBus_Sr_id() {
	return Bus_Sr_id;
}
public void setBus_Sr_id(int bus_Sr_id) {
	
	Bus_Sr_id = bus_Sr_id;
	
}

}
