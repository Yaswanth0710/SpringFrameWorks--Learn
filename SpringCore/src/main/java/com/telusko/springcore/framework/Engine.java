package com.telusko.springcore.framework;

public class Engine {
/**
 Assigning Parameter value through constructor-argument
 
 */
 
	private String HorsePower;
	
	public Engine(String horsePower) {
		super();
		HorsePower = horsePower;
	}
	
	@Override
	public String toString() {
		return HorsePower;
	}
}
