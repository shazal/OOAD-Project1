package com.zoo;

public class Canine extends Animal{
	public Canine(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public Canine() {
		
	}

	public void roam() {
		System.out.println(this.name + "of type canine is roaming");
	}
}
