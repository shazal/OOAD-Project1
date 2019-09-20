package com.zoo;

public class Elephant extends Pachyderm {
	public Elephant(String name) {
		super(name);
	}
	private String type = "Pachyderm";
	public void makeNoise() {
		System.out.println("Elephant sound!");

	}
	public void wakeUp() {
		
	}
	public void eat() {
		System.out.println(this.name+ " of type "+ this.type  +" is eating leaves!");		
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
