package com.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.setter.Student;

public class Mainclass {

	public static void main(String[] args) 
	{
		//create the container
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("springconfig.xml");
		
		//get the beans
	    Student stud1=(Student) context.getBean("s1");
	    Student stud2=(Student) context.getBean("s2");
	    
	   //use the beans
	    System.out.println(stud1);
	    System.out.println(stud2);
	    
	    //close the container
	    context.close();
	}

}
