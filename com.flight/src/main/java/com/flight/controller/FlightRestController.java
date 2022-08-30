package com.flight.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flight.entity.UserEntity;
import com.flight.repository.UserRepository;
import com.flight.service.FlightService;

@RestController
@RequestMapping("/api/user")
public class FlightRestController {

	@Autowired
	UserRepository userRepository;
	@Autowired
	FlightService flightService;
	
	@GetMapping
    public Iterable<UserEntity> findAllUsers() {
		//return null;
       
		 return userRepository.findAll();
    }
 
    @GetMapping("/{userId}")
    public ResponseEntity<UserEntity> findUserByUserId(@PathVariable(value = "userId") Integer userId) {
		//return null;
		 Optional<UserEntity> user = userRepository.findById(userId);
		 
		    if(user.isPresent()) {
		        return ResponseEntity.ok().body(user.get());
		    } else {
		        return ResponseEntity.notFound().build();
		    }
       // Soni need to check
    }
 
    @PostMapping
    public UserEntity saveUser(@Validated @RequestBody UserEntity user) {
		return flightService.saveUser(user);
		// return userRepository.save(user);
    }
}
