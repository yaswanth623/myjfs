package com.myboot.bootapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestApi {
	@RequestMapping(value = "test")
	public String hello() {
		return "Hello World";
	}
	
	@GetMapping(value = "student")
	public Student getStudent() {
		Student student=new Student(101, "Virat");
		return student;
	}
	
	@PostMapping(value = "studentdata")
	public String postStudent() {
		return "Done";
	}
	
	@GetMapping(value = "student/{name}")
	public Student getStudentName(@PathVariable String name){
		Student student=new Student(10,name);
		return student;
	}
}
