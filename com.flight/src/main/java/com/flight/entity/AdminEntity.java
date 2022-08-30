package com.flight.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class AdminEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer adminId;
	
	private String flightNumber;
	
	private String airline;
	
	private String fromPlace;
	
	private String toPlace;
	
	private Integer ticketCost;

	@Override
	public String toString() {
		return "adminEntity [adminId=" + adminId + ", flightNumber=" + flightNumber + ", airline=" + airline
				+ ", fromPlace=" + fromPlace + ", toPlace=" + toPlace + ", ticketCost=" + ticketCost + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public Integer getAdminId() {
		return adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public String getFromPlace() {
		return fromPlace;
	}

	public void setFromPlace(String fromPlace) {
		this.fromPlace = fromPlace;
	}

	public String getToPlace() {
		return toPlace;
	}

	public void setToPlace(String toPlace) {
		this.toPlace = toPlace;
	}

	public Integer getTicketCost() {
		return ticketCost;
	}

	public void setTicketCost(Integer ticketCost) {
		this.ticketCost = ticketCost;
	}

}





//Flight number
//Airline
//From Place
//To Place 
//Ticket cost
