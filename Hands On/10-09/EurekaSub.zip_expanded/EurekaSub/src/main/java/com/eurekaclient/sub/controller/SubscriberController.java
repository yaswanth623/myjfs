package com.eurekaclient.sub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.eurekaclient.sub.model.Employee;

@RestController
public class SubscriberController {
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping("/getemp")
	public Employee getEmployee() {
		Employee employee=restTemplate.getForObject("http://pub/getemployee", Employee.class);
		return employee;
	}
}
