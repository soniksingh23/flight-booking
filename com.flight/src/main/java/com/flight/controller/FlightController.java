package com.flight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller // spring bean
@RequestMapping("/flight")
public class FlightController {
	
  @RequestMapping("/")
  @ResponseBody
  public String getFlight() {
	  return "Flight booked!";
  }
  
}
