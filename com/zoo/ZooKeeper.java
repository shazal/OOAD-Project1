package com.zoo;

import java.util.ArrayList;
import java.util.List;

public class ZooKeeper {
	List<Animal> zoo = new ArrayList<Animal>();
	public void addAnimal(Animal animal) {
		this.zoo.add(animal);
	}
	public void wakeAnimals() {
		this.zoo.forEach((temp)->{
			temp.wakeUP();
		});
	}
	public void rollCall() {
		this.zoo.forEach((temp)->{
			System.out.println(temp.name + " is now " +temp.condition);
		});
	}
	public void feedTheAnimals(){
		System.out.println("feeding animals!");
		this.zoo.forEach((temp)->{
			temp.eat();
		});
	}
	public void exerciseTheAnimals() {
		System.out.println("exercising the animals!");
		this.zoo.forEach((temp)->{
			temp.roam();
		});
	}
	public void shutDown() {
		System.out.println("Shutting down the zoo!");
		int size = this.zoo.size();
		for (int i =0; i< size; i++) {
			Animal temp = this.zoo.remove(0);
			System.out.println(temp.name +" was set free!");
		}
	}

	
}
