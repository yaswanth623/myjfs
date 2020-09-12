package com.mypub.demo.controller;


import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mypub.demo.bean.Bank;

@RestController
public class BankController {
	@GetMapping(value = "/getbank")
	public Bank getBank() {
		return new Bank("SBI", "Mount Road", "Chennai");
	}
	
	@GetMapping(value = "/getbanks")
	public List<Bank> getBanks(){
		return (List<Bank>)Arrays.asList(
				new Bank("SBI", "Mount Road", "Chennai"),
				new Bank("ICICI", "LB Nagar", "Hyderabad"),
				new Bank("HDFC", "Madiwala", "Bengaluru"));
	}
}
