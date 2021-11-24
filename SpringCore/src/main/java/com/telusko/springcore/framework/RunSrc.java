package com.telusko.springcore.framework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunSrc {

	public static void main(String[] args) {
		
/**
   Tight Coupling 
*/
				System.out.println("Printing data relevent to Tight Coupling");
				
				Car car = new Car ();
				car.Drive();
		
				Bike bike = new Bike();
				bike.Drive();
		
				Vehicle vh = new Bike();
				vh.Drive();
		 		
/** Loose Coupling Achieved 
    through Dependency Injection (IOC :-Inversion of Control) 
    of Spring Frame Work  
*/		
		System.out.println("\n");
		System.out.println("Printing data relevent to Loose Coupling Achieved through Dependency Injection (IOC :-Inversion of Control)of Spring Frame Work");		
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("Spring.xml");
		
		Vehicle v = (Vehicle) factory.getBean("vehicle");
		v.Drive();
				
		Tyre t = (Tyre) factory.getBean("tyre");
		System.out.println(t.getBrand());
		t.SpData();
		
		SpareParts s = (SpareParts) factory.getBean("spareparts");
		s.handover();
		
		Engine e = (Engine) factory.getBean("engine");
		System.out.println(e);
	}
	
}
