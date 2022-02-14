package com.skillstorm.week1.day4;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLearning {
	
	static Scanner sc;
	//create an array
	public static void main(String[] args) {
		sc = new Scanner(System.in);
	
	String[] tires; // declare an array
	tires = new String[8];// initialize an array
	
	String[] fruits = new String[6];
	fruits[0] = "Orange";
	fruits[1] = "Pear";
	fruits[2] = "Casava";
	fruits[3] = "Apple";
	fruits[4] = "Pine";
	fruits[5] = "Banana";
	
	//display values in the array with loop
	// use while loop
	int i = 0;
	while(i < fruits.length) {
		System.out.println("The elements of the array "+ i + " is " + fruits[i]);
		i++;
	}
	
	// use for loop
	for(int count = 0; count < fruits.length; count++) {
		System.out.println("The value of count = "+ count);
	}
	
	//print in reverse order
	for(int count = fruits.length -1; count >= 0; count--) {
		System.out.println("The value of fruit "+ count + " in reverse order = " + fruits[count]);
	}
	
	//use for-each loop
	for (String forloop : fruits) {
		System.out.print(forloop);
	}
	
	System.out.println();
	System.out.println();
	
	int[] numbers = {1,2,3,4,5};
	numbers[2] = 56; // change the value of an array
	
	//int i = 0;
	while(i < numbers.length) {
		System.out.println("The value of the array "+ i + " = " + numbers[i]);
		i++; 
		
		System.out.println("Loop ended");
	}
		
		
//	for(int p = 0; p < numbers.length; p++) {
//		System.out.println("The numbers of the array "+ p + " = " + numbers[p]);
//	}
	
//	System.out.println(fruits[0]); // to find the first element in the array
//	System.out.println(fruits[1]);
//	System.out.println(fruits[2]);
//	System.out.println(fruits[3]);
//	System.out.println(fruits[4]);
//	System.out.println(fruits[5]);
//	System.out.println("The array size is " + fruits.length);
//	
//	System.out.println(numbers[0]);
//	System.out.println(numbers[1]);
//	System.out.println(numbers[2]);
//	System.out.println(numbers[3]);
	//System.out.println(numbers[5]);
	
	System.out.println("The max number is " + Math.max(10, 345));
	
	 // use arrayName.length to get the size of the array
	System.out.println("The size of the tires array = " + tires.length);
	// use arrayName[arrayName.length-1] to get the size of the array
	System.out.println("The last item in the array = " + fruits[fruits.length-1]); 
	
	//getBestFriends();
	getNum();
	//getArray();
	
	sc.close();
	
	
//	int count = 0;
//	
//	while(count <= 3) {
//		System.out.println("The value of count = "+ count);
//		count++;
//	}
	
	
	//create an array from user input
	
	}
	
	public static void getArray() {
	//	ArrayList<String> cars = new ArrayList<String>();
		
		String[] cars = new String[3];
		System.out.println("Pls enter 3 numbers");
		System.out.println("The first number is ");
		cars[0] = sc.nextLine();
		System.out.println("The second number is ");
		cars[1] = sc.nextLine();
		System.out.println("The third number is ");
		cars[2] = sc.nextLine();
		
		for(String i : cars) {
			System.out.println("You entered " + i);
		}
		
	}
	public static void getBestFriends() {
		String[] cars = new String[2];
		
		String res = " ";
	
		do {
			System.out.println("Please enter your favourite cars");
			cars[0] = sc.nextLine();
			cars[1] = sc.nextLine();
			
			System.out.println("Your first selection is: " + cars[0]);
			System.out.println("You second selection is: " + cars[1]);
			
			System.out.println("Do you want to keep playing? ");
			res = sc.nextLine();
			}
		while (res.equalsIgnoreCase("Y"));{
			if(res.equalsIgnoreCase("N")) {
			System.out.println("Game Over!!");}
		}

	}

	public static void getNum() {
		String[] num = new String[2];
		
		String res = "Y";
		while (res.equalsIgnoreCase("Y")) {
		
		System.out.println("Please enter your first favourite car:");
		num[0] = sc.nextLine();
		System.out.println("Please enter your second car:");
		num[1] = sc.nextLine();
		
		for(String ans : num) {
			System.out.println("You entered: " + ans);}
		System.out.println("Do you want to continue? y/n");
		res = sc.next();
		if (res.equalsIgnoreCase("N")) {
			System.err.println("Fuck-off!");
		}
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
