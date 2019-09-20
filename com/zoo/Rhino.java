package com.zoo;

public class Rhino extends Pachyderm {
	public Rhino(String name) {
		super(name);
	}
	
	private String type = "Pachyderm";
	public void makeNoise() {
		System.out.println("Rhino sound!");

	}
	public void wakeUp() {
		
	}
	public void eat() {
		System.out.println(this.name+ " of type "+ this.type  +" is eating food!");

	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
