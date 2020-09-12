package com.tasktrial.passdemo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tasktrial.passdemo.dao.PassDemoDao;
import com.tasktrial.passdemo.model.PassDemo;

@Controller
public class HomeController {
	
	@Autowired
	PassDemoDao dao;
	
	@RequestMapping(value = "/test")
	public String home() {
		System.out.println("Home Method");
		String s=dao.saveMethod(new PassDemo(104, "my_username", "my_password", "when", "my_answer"));
		System.out.println(s);
		return "home";
	}
	
	@RequestMapping(value = "/login")
	public String loginpage() {
		System.out.println("Login page displayed");
		return "loginpage";
	}
	
	@RequestMapping(value = "/loginValidation")
	public String loginValidation(Model model,
			@RequestParam("username") String username,
			@RequestParam("password") String password) {
		System.out.println("login method");
		System.out.println(username);
		System.out.println(password);
		ArrayList<PassDemo> passdemo=dao.validateLogin(username);
		model.addAttribute("passdemo", passdemo);
		String pswd=passdemo.get(0).getPassword();
		System.out.println(pswd);
		  if(pswd.equals(password)) {
			  return "home"; 
			  } 
		  else { 
			  return "invalid"; 
			  }		 
	}
	
	@RequestMapping(value = "/forgotPassword")
	public String forgotPassword() {
		System.out.println("Forgot password page displayed");
		return "forgotpasswordpage";
	}
	
	
	//Change Password
	int userId=0;
	
	@RequestMapping(value = "/accountValidate")
	public String accountValidate(Model model,
			@RequestParam("userId") String userId,
			@RequestParam("securityQuestion") String securityQuestion,
			@RequestParam("securityAnswer") String securityAnswer) {
		System.out.println(userId);
		System.out.println(securityQuestion);
		System.out.println(securityAnswer);
		
		int uId=Integer.parseInt(userId);
		this.userId=uId;
		
		PassDemo passdemo=dao.getDetails(uId);
		String sq=passdemo.getSecurityQuestion();
		System.out.println(sq);
		String sa=passdemo.getSecurityAnswer();
		System.out.println(sa);
		if(sq.equals(securityQuestion)) {
			if(sa.equals(securityAnswer))
				return "changepassword";
		}
		return "invalid";
	}
	
	@RequestMapping(value = "/changePassword")
	public String changePassword(Model model, 
			@RequestParam("password") String password) {
			String s=dao.updatePassword(userId, password);
			System.out.println(s);
			return "home";
	}	
}
















