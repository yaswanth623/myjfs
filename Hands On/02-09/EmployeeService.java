package com.myapp.service;

import java.util.ArrayList;

import com.myapp.dao.EmployeeDao;
import com.myapp.model.Employee;



public class EmployeeService {
	public static void main(String[] args) {
		EmployeeDao dao=new EmployeeDao();
		/*ArrayList<Employee> employees=(ArrayList<Employee>)dao.getAge40Upward();

		for(Employee employee:employees){
		System.out.println(employee);
		}*/
		
		ArrayList<Employee> employees=(ArrayList<Employee>)dao.getAge40UpwardOrSalesDept();
		
		for(Employee employee:employees){
		System.out.println(employee);
		}
	}
}
