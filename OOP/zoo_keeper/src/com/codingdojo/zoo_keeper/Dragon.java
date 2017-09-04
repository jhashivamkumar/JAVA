package com.codingdojo.zoo_keeper;

public class Dragon extends Mammal {
	public Dragon() {
		this.energyLevel = 300;
	}
	public Dragon fly() {
		System.out.println("The dragon took off into the air with a whooosh! It lost 50 energy.");
		this.energyLevel -= 50;
		return this;
	}
	public Dragon eatHumans() {
		System.out.println("The dragon gained 25 energy.");
		this.energyLevel += 25;
		return this;
	}
	public Dragon attackTown() {
		System.out.println("The dragon set a town on fire and the screams of the townspeople can be heard for miles. The dragon lost 100 energy.");
		this.energyLevel -= 100;
		return this;
	}
}
