import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;


public class MainApp {
	
	public static void main(String[] args) {
		
		Map<Integer, Student> stdMap = new ConcurrentHashMap<Integer, Student>();
		
		stdMap.put(1,new Student(1, "Peter"));
		stdMap.put(2,new Student(2, "XI Pi"));
		stdMap.put(3,new Student(3, "Patrick"));
		stdMap.put(4,new Student(4, "Lisbon"));
		stdMap.put(5,new Student(5, "Rachel"));
		stdMap.put(6,new Student(6, "Ross"));
		stdMap.put(7,new Student(7, "Joey"));
		
		System.out.println("Before removing all the students with even number Ids");
	
		
		for(Entry<Integer, Student> entity : stdMap.entrySet())
		{
			System.out.println("Id : "+ entity.getKey() + " : "+ entity.getValue());
			stdMap.put(100, new Student(100, "xyz"));
			
		}		
		
		
	}

}
