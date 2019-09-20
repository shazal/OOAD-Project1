package com.zoo;

import java.util.Random;

public class Cat extends Feline {
	
	public Cat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	private String type = "Feline";
	public void makeNoise() {
		Random rand = new Random();
		int randNum = rand.nextInt(3);
		if (randNum == 1) {
			System.out.println("Meow!");			
		} else {
			super.makeNoise(randNum);
		}
	}
	public void eat() {
		System.out.println(this.name+ " of type "+ this.type +" is eating fish!");
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
