package com.zoo;

public class Lion extends Feline {
	public Lion(String name) {
		super(name);
	}
	
	private String type = "Feline";
	public void makeNoise() {
		System.out.println("Lion sound!");

	}
	public void wakeUp() {
		
	}
	public void eat() {
		System.out.println(this.name+ " of type "+ this.type  +" is eating deer!");
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	

}
