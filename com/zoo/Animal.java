package com.zoo;

public class Animal {
	public Animal(String name) {
		super();
		this.name = name;
	}
	public Animal () {
		
	}

	protected String name;
	protected String condition;
	public void sleep() {
		this.condition = "asleep";
	}

	public void makeNoise() {
		System.out.println(this.name + " is making Animal noise!");
	}
	public void eat () {
	}
	public void wakeUP() {
		// TODO Auto-generated method stub
		this.condition= "awake";
		System.out.println(this.name + "woke up!");	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void roam() {
		// TODO Auto-generated method stub
		
	}

}
