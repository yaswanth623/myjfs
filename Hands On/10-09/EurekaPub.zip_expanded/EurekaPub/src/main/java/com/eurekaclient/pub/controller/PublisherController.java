package com.eurekaclient.pub.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eurekaclient.pub.model.Employee;

@RestController
public class PublisherController {
	@RequestMapping(value = "/getemployee")
	public Employee getEmployee() {
		return new Employee("John", 10000);
	}
}
