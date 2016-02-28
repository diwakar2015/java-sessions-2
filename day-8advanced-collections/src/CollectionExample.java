import java.util.HashSet;

public class CollectionExample {
	
	public static void main(String[] args) {
		
		HashSet<Student> studentSet = new HashSet<Student>();
		
		Student s1 = new Student(1, "Peter");
		
		Student s2 = new Student(2, "Xi Pi");
		Student s3 = new Student(3, "Rachel");
		Student s4 = new Student(3, "Rachel");
		Student s5 = new Student(4, "John");
		Student s6 = new Student(5, "Patrick");
		Student s7 = new Student(5, "Patrick");
		
		System.out.println("s3 : "+ s3);
		System.out.println("s4: "+ s4);
		
		studentSet.add(s1);
		studentSet.add(s2);
		studentSet.add(s3);
		studentSet.add(s4);
		studentSet.add(s5);
		studentSet.add(s6);
		studentSet.add(s7);
	
		System.out.println("Size of the studentSet : "+ studentSet.size());
		
		for(Student s : studentSet)
		{
			System.out.println("Id : " + s.getId() + " Name: "+ s.getName());
		}
		
	}
	

}
