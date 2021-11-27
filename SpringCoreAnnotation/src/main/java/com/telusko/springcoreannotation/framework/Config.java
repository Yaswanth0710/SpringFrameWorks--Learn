package com.telusko.springcoreannotation.framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages ="com.telusko.springcoreannotation.framework")
public class Config {
/*	
	@Bean
	public Mobile getPhone(){
		return new Mobile();
	}
	
	@Bean
	public Processor getSpec(){
		return new MediaTek();
	}*/
}
