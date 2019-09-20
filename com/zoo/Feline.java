package com.zoo;

public class Feline extends Animal {
	public Feline(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public Feline() {
		
	}
	public void makeNoise(int randNum) {
		if (randNum == 2) {
			super.makeNoise();
		} else {
			System.out.println(this.name + " is making Feline noise!");			
		}
	}

	public void roam () {
		System.out.println(this.name + " of type Feline is roaming");		
	}
}
