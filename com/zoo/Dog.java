package com.zoo;

public class Dog extends Canine {
	public Dog(String name) {
		super(name);
	}
	private String type = "Canine";
	public void makeNoise() {
		System.out.println("Woof!");

	}
	public void wakeUp() {
	}
	public void eat() {
		System.out.println(this.name+ " of type "+ this.type  +" is eating meat!");		
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
