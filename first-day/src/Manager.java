
public class Manager {
	
	int empId;
	String name;
	String dept;
	public  int noOfReportees;
	
	
	public   void canGiveRating()
	{
		System.out.println("Giving rating...");
	}
	
	public void work()
	{
		System.out.println("Doing work");
	}
	
	
	
	public static void main(String[] args) {
		
		
		Manager mgr = new Manager();
		mgr.canGiveRating();
		mgr.noOfReportees = 10;
	}

}


