import java.util.Iterator;
import java.util.LinkedHashSet;

public class CollectionsExample {
	
	public static void main(String[] args) {
		
	LinkedHashSet<String> names = new LinkedHashSet<String>();
	
	names.add("abc");
	names.add("xyz");
	names.add("abc");
	names.add("xyp");
	names.add("abc");
	names.add("pp3");
	
System.out.println("size : "+ names.size());
	Iterator<String> itr = names.iterator();
	
	while(itr.hasNext())
	{
		System.out.println(itr.next());
		
	}
		
	
	
	//fail-safe
	//fail-fast
	
	
		
	}


}
