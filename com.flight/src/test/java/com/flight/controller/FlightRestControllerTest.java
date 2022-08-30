package com.flight.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.flight.entity.UserEntity;
import com.flight.repository.UserRepository;
import com.flight.service.FlightService;


@ExtendWith(MockitoExtension.class)
public class FlightRestControllerTest {
	
	@Mock
	FlightService flightService;
	@InjectMocks
	FlightController controller;
	

	@Autowired
	UserRepository userRepository;
	

//	@Test
//	void testSaveUser1() {
//		UserEntity user = new UserEntity();
//		user.setId(1);
//		when(service.save(user)).thenReturn(user);// mocking
//		Integer savedUserId = controller.saveUser1(user);
//		assertEquals(1, savedUserId);
//	}
//
//	
//	 @PostMapping
//	    public UserEntity testSaveUser1(@Validated @RequestBody UserEntity user) {
//			
//			 return userRepository.save(user);
//	    }
}


	