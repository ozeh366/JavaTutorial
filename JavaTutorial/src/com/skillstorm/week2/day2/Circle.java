package com.skillstorm.week2.day2;

import java.util.Scanner;

public class Circle {
	

	int radius; // R = D / 2
	double diameter; // D = 2 * r
	float circumference; // C = 2 * PI * R
	float area; // A = PI * (R*R)
	
	static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		getCircleAtt();
		
		sc.close();
	}
		
	//Action Methods
	public void findRadius(){
			
		System.out.println("Please enter the value of the Diameter: ");
		diameter = sc.nextInt();
		sc.nextLine();
		radius = (int) (diameter/2);
		
		System.out.println("The Radius of the circle with a "+ diameter +" diameter is: "+ radius);
	}
	public void findDiameter(){
		
		System.out.println("Please enter the value of the Radius: ");
		radius = sc.nextInt();
		sc.nextLine();
		
		diameter = 2 * radius;
		
		System.out.println("The Diameter of the circle with radius " + radius +" is: "+ diameter);
	}
	public void findCircumference(){

			System.out.println("Please enter the value of the Radius: ");
			radius = sc.nextInt();
			sc.nextLine();
			
			circumference = (float) (2 * Math.PI * radius);
			
			System.out.println("The Circumference of the circle with a " + radius +" radius is: "+ circumference);
			
		}
	public void findArea(){
		System.out.println("Please enter the value of the Radius: ");
		radius = (int) sc.nextFloat();
		sc.nextLine();
		
		area = (float) (Math.PI * Math.pow(radius, 2));
		
		System.out.println("The Area of the circle with a " + radius +" radius is: "+ area);
		
	}
	public static void getCircleAtt(){
		
		Circle circle1 = new Circle();
		Circle circle2 = new Circle();
		
		String res;
		do {
		System.out.println("Which circle do you want to calculate? Hint; (Cirle1 or Cirle2)");
		String ans1 = sc.nextLine();
		sc.nextLine();
		
		if (ans1.equals("Circle1")) {
			System.out.println("What do you want to the calculate? Hint: (Area, Circum)");
			String ans = sc.nextLine();
			sc.nextLine();
			
			if (ans.equals("Circumference")) {
				circle1.findCircumference();
			}
			else if (ans.equals("Area")) {
				circle1.findArea();
			}
			else 
			{
				System.out.println("Invalid Entry");
			}
			
			}
		
		if (ans1.equals("Circle2")) {
			System.out.println("What do you want to the calculate? Hint: (Radius, & Diameter)");
			String ans2 = sc.nextLine();
			sc.nextLine();
			
			if (ans2.equals("Radius")) {
				circle2.findRadius();
			}
		
			else if (ans2.equals("Diameter")) {
				circle2.findDiameter();
			}
			else 
			{
				System.out.println("Invalid Entry");
			}
			
			}
		System.out.println("Do want to calculate a cirle? Hint: (y or n)");
		res = sc.nextLine();
		sc.nextLine();
		}
		 while (res.equals("y"));
		}

	}