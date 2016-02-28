//method level - FINAL
public class Department { // super Class, Parent class, Base Class

	public void displayDeparmentInfo()
	{
		System.out.println("Displaying it..Deparment Info: Departments");
	}
	
	public final void certificationDetails()
	{
		System.out.println("ISO 1900-2001");
	}
}

class CSE extends Department  // Child class, Sub class
{
	public void listCourses()
	{
		System.out.println("lisiting courses in CSE...");
	}
	
	@Override
	public void displayDeparmentInfo()
	{
		System.out.println("Displaying it..Deparment Info: CSE");
	}
	
/*	public void certificationDetails()
	{
		System.out.println("ISO 1700-2001");
	}*/
	
}

class ME extends Department
{
	public void listCourses()
	{
		System.out.println("lisiting courses in ME...");
	}
	
	@Override
	public void displayDeparmentInfo()
	{
		System.out.println("Displaying it..Deparment Info: ME");
	}
	
/*	public void certificationDetails()
	{
		System.out.println("ISO 1600-2001");
	}*/
}


