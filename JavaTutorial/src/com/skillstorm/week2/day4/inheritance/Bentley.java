package com.skillstorm.week2.day4.inheritance;

public class Bentley extends Animal{
	
	private String breed;
	private double weight;
	

	public Bentley(String color, String favoriteFood, int age, String name, String breed, double weight) {
		this.breed = breed;
		this.weight = weight;
	}
	
	
	public String getBreed() {
		return breed;
	}


	public void setBreed(String breed) {
		this.breed = breed;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public static void main(String[] args) {
		Bentley bentley = new Bentley("Brown", "Bokkoli", 3, "Bentley", "Yorkie", 9);
		bentley.setName("Bentley");
		//bentley.set;
		System.out.println(bentley.breed);
		System.out.println(bentley.getName());

	}

}
