package com.main;

import com.zoo.Animal;
import com.zoo.Cat;
import com.zoo.Dog;
import com.zoo.Elephant;
import com.zoo.Hippo;
import com.zoo.Lion;
import com.zoo.Rhino;
import com.zoo.Tiger;
import com.zoo.Wolf;
import com.zoo.ZooKeeper;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZooKeeper zooKeeper = new ZooKeeper();
		zooKeeper.addAnimal(new Cat("Chole"));
		zooKeeper.addAnimal(new Cat("Cole"));
		zooKeeper.addAnimal(new Dog("Daz"));
		zooKeeper.addAnimal(new Dog("Dug"));
		zooKeeper.addAnimal(new Elephant("Elf"));
		zooKeeper.addAnimal(new Elephant("Eu"));
		zooKeeper.addAnimal(new Hippo("Hommie"));
		zooKeeper.addAnimal(new Hippo("Hula"));
		zooKeeper.addAnimal(new Lion("lame"));
		zooKeeper.addAnimal(new Lion("Lasso"));
		zooKeeper.addAnimal(new Rhino("Rami"));
		zooKeeper.addAnimal(new Rhino("Rufi"));
		zooKeeper.addAnimal(new Tiger("Tika"));
		zooKeeper.addAnimal(new Tiger("Terry"));
		zooKeeper.addAnimal(new Wolf("Willy"));
		zooKeeper.addAnimal(new Wolf("Woz"));
		
		zooKeeper.wakeAnimals();
		zooKeeper.rollCall();
		zooKeeper.feedTheAnimals();
		zooKeeper.exerciseTheAnimals();
		zooKeeper.shutDown();
		
		Animal chole = new Cat("Chole");
		chole.makeNoise();
		chole.makeNoise();
		chole.makeNoise();
		chole.makeNoise();
		chole.makeNoise();
		chole.makeNoise();
		chole.makeNoise();
	}

}
