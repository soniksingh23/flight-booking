package com.flight.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.flight.entity.FlightEntity;
import com.flight.entity.UserEntity;
import com.flight.repository.AdminRepository;
import com.flight.repository.FlightRepository;
import com.flight.repository.UserRepository;


public class FlightService {
	@Autowired
	FlightRepository flightRepository;
	
	@Autowired
	AdminRepository adminRepository;
	
	@Autowired
	UserRepository userRepository;
	
	public FlightEntity save(FlightEntity flightuser) {
		
		if (flightuser.getRole().equals("user"))	
			flightRepository.save(flightuser);
		
		else
			throw new IllegalArgumentException("Admin can't book Flight");
		return flightuser;
	}
	
	public Iterable<FlightEntity> getFlightuser() {
		return flightRepository.findAll();
	}

	 public UserEntity saveUser(UserEntity user) {
			
			 return userRepository.save(user);
	    }
}


