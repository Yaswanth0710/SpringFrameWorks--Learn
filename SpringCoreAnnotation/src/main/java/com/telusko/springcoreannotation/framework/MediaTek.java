package com.telusko.springcoreannotation.framework;

import org.springframework.stereotype.Component;

@Component
public class MediaTek implements Processor {

	public void name() {
		System.out.println("The Moderate Consumer Processor");
	}
}
