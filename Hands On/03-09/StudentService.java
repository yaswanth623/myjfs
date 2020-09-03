package com.myspr.service;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.myspr.demo.Student;

public class StudentService {

	public static void main(String[] args) {
		
		BeanFactory factory=new ClassPathXmlApplicationContext("spring.xml");
		Student student=(Student)factory.getBean("student");
		System.out.println(student);
	}

}
