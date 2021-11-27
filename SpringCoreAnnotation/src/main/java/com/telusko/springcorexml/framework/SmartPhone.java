package com.telusko.springcorexml.framework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SmartPhone implements RawData{
	
	@Autowired
	private Specifications spec;
	
	public Specifications getSpec() {
		return spec;
	}
	
	public void setSpec(Specifications spec) {
		this.spec = spec;
	}
	
	public void displaySpeed(){
		System.out.println("Speed:- 120Hz");
		spec.data();
	}

	@Bean
	public void batteryCapacity() {
		System.out.println("Battery Capacity:- 5000mAh");
	}

}
