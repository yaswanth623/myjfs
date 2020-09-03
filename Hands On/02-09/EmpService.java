package com.myapp.service;

import java.util.ArrayList;
import java.util.List;

import com.myapp.dao.EmpDao;
import com.myapp.model.Emp;
import com.myapp.model.Employee;

public class EmpService {

	public static void main(String[] args) {
		
		EmpDao dao=new EmpDao();
		/*Emp emp=new Emp("Emma", "Watson", 26);
		System.out.println(dao.saveEmp(emp));*/
		
		ArrayList<Emp> empls=(ArrayList<Emp>)dao.get3Employee();
		
		//System.out.println(empls);
		
		for(Emp emp:empls){
			System.out.println(emp);
			}
	}

}
