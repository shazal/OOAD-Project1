package com.zoo;

public class Wolf extends Canine {
	public Wolf(String name) {
		super(name);
	}
	
	private String type = "Canine";
	public void makeNoise() {
		System.out.println("Wolf sound!");

	}
	public void wakeUp() {
		
	}
	public void eat() {
		System.out.println(this.name+ " of type "+ this.type  +" is eating rabbit!");

	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
