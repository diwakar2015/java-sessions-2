
public class Circle implements Shape{

	@Override
	public void draw() {
		
		System.out.println("Drawing Circle...");
		
	}

	@Override
	public void fillColor() {
		
		System.out.println("Filling Red color");
		
	}
	
	public void area()
	{
		System.out.println("Formula : 3.14*r*r");
	}
	

}
