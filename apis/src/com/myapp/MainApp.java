package com.myapp;

import com.diwakar.apis.MyArrayList;

public class MainApp {
	
	
	public static void main(String[] args) {
		
		MyArrayList<Integer> list = new MyArrayList<Integer>();
		
		list.add(10);
		list.add(5);
		list.add(12);
		list.add(11);
		list.add(100);
		list.add(8);
		
	   for(int i=0; i<=list.size()-1; i++)
	   {
		  System.out.println("Value : "+ list.get(i)); 
	   }
	   
	   list.remove(5);
	   System.out.println("After removal...");
	   for(int i=0; i<=list.size()-1; i++)
	   {
		  System.out.println("Value : "+ list.get(i)); 
	   }
	   
	list.sort();
	
	System.out.println("after sort..");
	  for(int i=0; i<=list.size()-1; i++)
	   {
		  System.out.println("Value : "+ list.get(i)); 
	   }
		
	}

}
