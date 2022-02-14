package com.skillstorm.week2.day1;

public class Country {

	String name;
	String continent;
	double temp;
	boolean isLanguageEnglish;
	
	public static void main(String[] args) {
		Country usa = new Country("USA", "America", 90);
		Country france = new Country("France", "Europe", 70);
		Country niger = new Country("Niger", "Africa", 90);
		System.out.println("Which countinent is "+ usa.name +" located? Answer: "+ usa.continent);
		System.out.println("Temperature in "+ france.name + " is usually around " + france.temp +" in the Summer");
		niger.getLocation(niger.name, niger.continent);
		niger.isLanguageEnglish = false;
		System.out.println("Is English the official language in Niger? Ans: "+ niger.isLanguageEnglish);
	}
	
	
	public Country() {
		this.name = "Nigeria";
		this.continent = "Africa";
		this.temp = 70;
		this.isLanguageEnglish = true;
		}
	
	public Country(String name, String continent) {
		this.name = name;
		this.continent = continent;
	}
	
	public Country(String name, String continent, double temp) {
		this.name = name;
		this.continent = continent;
		this.temp = temp;
	}
	
	public Country(String name, String continent, double temp, boolean isLanguageEnglish) {
		this.name = name;
		this.continent = continent;
		this.temp = temp;
		this.isLanguageEnglish = isLanguageEnglish;
	}
	
	void getLocation(String name, String continent) {
		System.out.println("Which continent is " + this.name + "? Answer: "+ this.continent);
	}
	
}