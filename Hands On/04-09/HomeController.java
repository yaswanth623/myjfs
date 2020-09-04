package com.spr.spr;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spr.spr.Student;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/")
	public String home() {
		return "home";
	}
	
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, false));
	}
	
	@RequestMapping(value = "/test")
	public String myMeth() {
	return "home";
	}
	
	/*
	 * @RequestMapping(value="display") public String myMeth2(Model
	 * model,@RequestParam() Map<String,String> params) {
	 * 
	 * 
	 * String name= params.get("name"); String studentId=params.get("studentId");
	 * String address=params.get("address"); int
	 * sem=Integer.parseInt(params.get("sem"));
	 * 
	 * Student student=new Student(name, studentId, address, sem);
	 * model.addAttribute("student",student); return "design"; }
	 */
	
	@RequestMapping(value="display")
	public String myMeth2(@ModelAttribute Student student) {
		
		//model.addAttribute("student",student);
		return "design";
	}
	
}
