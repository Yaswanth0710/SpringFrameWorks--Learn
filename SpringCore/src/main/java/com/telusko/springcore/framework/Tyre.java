package com.telusko.springcore.framework;

public class Tyre {
	
	private String brand;
	private SpareParts parts;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public SpareParts getParts() {
		return parts;
	}

	public void setParts(SpareParts parts) {
		this.parts = parts;
	}
	
	public void SpData(){
		parts.handover();
	}
}
