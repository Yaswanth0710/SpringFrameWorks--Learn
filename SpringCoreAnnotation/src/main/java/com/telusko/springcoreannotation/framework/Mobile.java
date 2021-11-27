package com.telusko.springcoreannotation.framework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Mobile 
{	
	@Autowired
	@Qualifier("mediaTek")
	private Processor processor;
	
	public Processor getProcessor() {
		return processor;
	}

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}

	public void company(){
		System.out.println("The One Plus 9R");
		processor.name();
	}
}
