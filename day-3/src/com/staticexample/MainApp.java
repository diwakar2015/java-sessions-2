package com.staticexample;

public class MainApp {
	
	public static void main(String[] args) {
		
		
		
		
		Student peterObject = new Student();
		peterObject.name = "Peter";
		peterObject.rollNo = 1;
		
		
		
		Student johnObject = new Student();
		johnObject.name = "John";
		johnObject.rollNo = 2;
		
		
		
		System.out.println("Displaying Peter information ....");
		peterObject.displayInformation(peterObject);
		
		System.out.println("\n\nDisplaying John information ....");
		johnObject.displayInformation(johnObject);
		
	}
	
	

}
