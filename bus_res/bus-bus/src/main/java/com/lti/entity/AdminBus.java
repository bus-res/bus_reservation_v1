package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ADMIN_BUS")

public class AdminBus {
	
	@Id
	@GeneratedValue
	
private int Bus_Sr_Id;
private String Bus_Comp_Name;
private String Number_Plate;
private  int No_Seats;
public int getBus_Sr_Id() {
	return Bus_Sr_Id;
}
public void setBus_Sr_Id(int bus_Sr_Id) {
	Bus_Sr_Id = bus_Sr_Id;
}
public String getBus_Comp_Name() {
	return Bus_Comp_Name;
}
public void setBus_Comp_Name(String bus_Comp_Name) {
	Bus_Comp_Name = bus_Comp_Name;
}
public String getNumber_Plate() {
	return Number_Plate;
}
public void setNumber_Plate(String number_Plate) {
	Number_Plate = number_Plate;
}
public int getNo_Seats() {
	return No_Seats;
}
public void setNo_Seats(int no_Seats) {
	No_Seats = no_Seats;
}

}
