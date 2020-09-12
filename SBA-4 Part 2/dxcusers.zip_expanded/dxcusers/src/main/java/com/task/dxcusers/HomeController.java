package com.task.dxcusers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.task.dxcusers.dao.DxcUsersDao;
import com.task.dxcusers.model.DxcUsers;

@Controller
public class HomeController {
	@Autowired
	DxcUsersDao dao;
	
	@RequestMapping(value = "/test")
	public String home() {
		System.out.println("Home Method");
		String s=dao.saveMethod(new DxcUsers(105, "virendersehwag", "blast", "what is the name of your childhood friend", "Ram"));
		return "home";
	}
	
	@RequestMapping(value = "/login")
	public String loginpage() {
		System.out.println("Login page displayed");
		return "login";
	}
	
	@RequestMapping(value = "/loginValidation")
	public String loginValidation(Model model,
			@RequestParam("username") String username,
			@RequestParam("password") String password) {
		System.out.println("login method");
		System.out.println(username);
		System.out.println(password);
		ArrayList<DxcUsers> dxcUsers=dao.validateLogin(username);
		model.addAttribute("dxcUsers", dxcUsers);
		String pswd=dxcUsers.get(0).getPassword();
		System.out.println(pswd);
		  if(pswd.equals(password)) {
			  return "home"; 
			  } 
		  else { 
			  return "loginInvalid"; 
			  }		 
	}
	
	@RequestMapping(value = "/forgotPassword")
	public String forgotPassword() {
		System.out.println("Forgot password page displayed");
		return "forgotPassword";
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
		
		DxcUsers dxcUsers=dao.getDetails(uId);
		String sq=dxcUsers.getSecurityQuestion();
		System.out.println(sq);
		String sa=dxcUsers.getSecurityAnswer();
		System.out.println(sa);
		if(sq.equals(securityQuestion)) {
			if(sa.equals(securityAnswer))
				return "changePassword";
		}
		return "forgotPasswordInvalid";
	}	
	
	@RequestMapping(value = "/changePassword")
	public String changePassword(Model model, 
			@RequestParam("password") String password) {
			String s=dao.updatePassword(userId, password);
			System.out.println(s);
			return "changePasswordSuccess";
	}
}














