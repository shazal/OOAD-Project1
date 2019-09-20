package com.zoo;

public class Hippo extends Pachyderm {
	public Hippo(String name) {
		super(name);
	}
	
	private String type = "Feline";
	public void makeNoise() {
		System.out.println("Hippo sound!");

	}
	public void wakeUp() {
		
	}
	public void eat() {
		System.out.println(this.name+ " of type "+ this.type  +" is eating fish!");		
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
