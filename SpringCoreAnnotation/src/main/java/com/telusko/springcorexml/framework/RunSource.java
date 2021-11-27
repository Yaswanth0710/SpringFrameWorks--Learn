package com.telusko.springcorexml.framework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunSource {
	
	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext ("Config.xml");
		 RawData sm = (RawData) context.getBean("smartPhone");
		 sm.displaySpeed();
	}
}

