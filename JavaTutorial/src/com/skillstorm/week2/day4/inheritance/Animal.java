package com.skillstorm.week2.day4.inheritance;

public class Animal { // If noting specified, Java extends Object

	// What does it take to be an animal
	// What properties do ALL animals share?
	private String color;
	private String favoriteFood;
	private int age;
	private String name;

	public Animal() {
		// Since we didn't add it, Java adds super()
		super(); // It calls Object's constructor
		System.out.println("Inside Animal's default constructor");
	}
	
	public Animal(String color, String favoriteFood, int age, String name) {
		this.color = color;
		this.favoriteFood = favoriteFood;
		this.age = age;
		this.name = name;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getFavoriteFood() {
		return this.favoriteFood;
	}
	
	public void setFavoriteFood(String favoriteFood) {
		this.favoriteFood = favoriteFood;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("I am an animal named " + this.name);
	}
	
	// I can pass in other animals
	public void eatOtherAnimal(Animal animal) {
		System.out.println("I am " + this.name + " and I am eating " + animal.name);
	}
	
	// What overriding toString does, is it allows us to choose what happens we print our object (or convert it to a String)
	@Override
	public String toString() {
		// Return the string to print
		return "Color: " + this.color + "\nFavorite Food: " + this.favoriteFood 
				+ "\nAge: " + this.age + "\nName: " + this.name + "\n";
	}
}