package com.telusko.springcoreannotation.framework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunSrc 
{
	
	public static void main (String Args[])
	{
		ApplicationContext context = new AnnotationConfigApplicationContext (Config.class);
		Mobile m = (Mobile) context.getBean(Mobile.class);
		m.company();
	}
}
