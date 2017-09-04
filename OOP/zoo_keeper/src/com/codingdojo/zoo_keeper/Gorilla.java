package com.codingdojo.zoo_keeper;

public class Gorilla extends Mammal {
	public Gorilla throwSomething() {
		System.out.println("The gorilla has thrown something and lost 5 energy.");
		this.energyLevel -= 5;
		return this;
	}
	public Gorilla eatBananas() {
		System.out.println("The gorilla happily ate some bananas and gained 10 energy.");
		this.energyLevel += 10;
		return this;
	}
	public Gorilla climb() {
		System.out.println("The gorilla has climbed a tree and lost 10 energy.");
		this.energyLevel -= 10;
		return this;
	}
}
