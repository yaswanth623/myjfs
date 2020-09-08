package com.myboot.mvc;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myboot.mvc.dao.MyUsersDao;
import com.myboot.mvc.model.MyUsers;

@Controller
public class HomeController {
	@Autowired
	MyUsersDao dao;
	
	@RequestMapping(value = "/test")
	public String home() {
		dao.saveUser(new MyUsers("testing", "mypass"));
		return "home";
	}
	
	@RequestMapping(value = "/get")
	public String getUsers(Model model) {
		ArrayList<MyUsers> myUsers=dao.getUser();
		model.addAttribute("myUsers", myUsers);
		System.out.println(myUsers);
		return "get";
	}
}
