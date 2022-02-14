package com.skillstorm.week2.day2;

public class Static {
									/* Static Keyword
									        Static method; Static method can only access static elements
									                       Static method can also access non-static elements through object
									
									        Non-Static Method: can access non-static and static elements directly
									 * 
									 */
	 String name = "Employee";
	 static int id = 100;
	 
	 void getEmployee() {
		 Static emp = new Static();
		 
		 //emp.name = "John";
		 // x = x + 5; same diff
		// x += 5; same diff
		
		 
		 System.out.println("mY NAME IS : "+ emp.name +" I make: "+ emp.id);
	 }
	 
	  static void getEmployees() {
		 Static emp = new Static();
		 
		// emp.name = "John";
		// emp.id = 100;
		 
		 System.out.println("mY NAME IS : "+ emp.name +" I make: "+ emp.id);
	 }
	 
	public static void main(String[] args) {
		getEmployees();
		Static printStatic = new Static();
	printStatic.getEmployee();

	}

}