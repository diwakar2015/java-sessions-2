import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class Sorting {
	
	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
	
		list.add(new Student(1, "Peter", "CSE")); 
		list.add(new Student(5, "Wozoski", "ECE"));
		list.add(new Student(4, "Xi Pi", "EE")); 
		list.add(new Student(2, "Den", "IT"));
		list.add(new Student(3, "Nick", "ME"));
		
		for(Student std : list)
		{
			System.out.println(std);
		}
		
		Collections.sort(list, new SortByName());
		
		
		System.out.println("\nSorted BY Name...");
		
		
		for(Student std : list)
		{
			System.out.println(std);
		}
		
		
	     Collections.sort(list, new SortById());
		
		
		System.out.println("\nSorted BY Id...");
		
		
		for(Student std : list)
		{
			System.out.println(std);
		}
		
	}

}
