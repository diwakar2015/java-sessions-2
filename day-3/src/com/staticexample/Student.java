package com.staticexample;
//static 
//method level
//variable level

public class Student {
	
	
	String name;
	int rollNo;

	
	public static void displayInformation(Student std)
	{
		System.out.println("Name : "+ std.name);
		System.out.print("Rolle Number: "+ std.rollNo);
	}
	
	public void favSubjects()
	{
		
	}

}


