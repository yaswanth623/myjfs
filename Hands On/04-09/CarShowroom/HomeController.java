package com.myshowroom.demo;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "home";
	}
	
	String showroomName="";
	@RequestMapping(value="display")
	public String myMeth(@RequestParam ("showroomName") String showroomName) {
		this.showroomName=showroomName;
		return "design";
	}
	
	ArrayList<Cars> cars=new ArrayList<Cars>();
	@RequestMapping(value="dispCars") 
	public String myMeth2(@ModelAttribute Cars car){
		
		cars.add(car);
		System.out.println(cars);
		return "design"; 
	}
		
	@RequestMapping(value = "displayCars")
	public String dispCars(Model model) {
	Showroom showroom =new Showroom(showroomName, cars);
	model.addAttribute("showroom",showroom);
	//System.out.println(showroom);
	return "result";
	}
	
}
