import java.util.concurrent.CopyOnWriteArrayList;


public class MainClass {
	
	
	public static void main(String[] args) {
		
		//fail safe
		CopyOnWriteArrayList<Student> stdList = new CopyOnWriteArrayList<Student>();
		
		stdList.add(new Student(1, "Peter"));
		stdList.add(new Student(2, "XI Pi"));
		stdList.add(new Student(3, "Patrick"));
		stdList.add(new Student(4, "Lisbon"));
		stdList.add(new Student(5, "Rachel"));
		stdList.add(new Student(6, "Ross"));
		stdList.add(new Student(7, "Joey"));
		
		System.out.println("Before removing all the students with even number Ids");
		display(stdList);
		
	
	/*	for(int i = 0; i<stdList.size(); i++)
		{
			if(stdList.get(i).getId()%2 ==0)
			{
				System.out.println("Student found with even Id : "+ stdList.get(i));
				stdList.remove(i);
				//stdList.add(new Student(10, "xyz"));
				//stdList.set(idx, new Student(100, "mno"));
				display(stdList);
				
			}
			
		}
		*/
		
		for(Student s : stdList)
		{
			if(s.getId()%2 ==0)
			{
				System.out.println("Student found with even Id : "+ s);
				stdList.remove(s);
				display(stdList);
				
			}
			else
			{
				System.out.println("Skipping the student : "+ s);
			}

			
		}
		
	System.out.println("\nAfter removing all the students with even number Ids");
	display(stdList);
		
	}
	
	public static void display(CopyOnWriteArrayList<Student> stdList)
	{
		for(Student s : stdList)
		{
			System.out.println(s);
		}
	}

}
