package com.skillstorm.week2.day3;

public class SwitchCase {

	public static void main(String[] args) {
		
		int week = 8;
		
		String weekNumber;
		
		switch(week) {
		case 1:
					weekNumber = "Monday";
				break;
		case 2:
					weekNumber = "Tuesday";
				break;
		case 3:
					weekNumber = "Wednesday";
				break;
		default:
					weekNumber = "Invalid Week";
				break;
		}
		System.out.println(weekNumber);

	}

}
