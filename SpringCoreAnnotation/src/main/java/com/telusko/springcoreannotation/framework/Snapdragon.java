package com.telusko.springcoreannotation.framework;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements Processor
{
	public void name() {
			System.out.println("The Most Consumer Processor");
	}	
}

