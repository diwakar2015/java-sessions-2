
public class MainApp2 {
	
	public static void main(String[] args) {
		
		Employee emp = new HR();
		Employee emp2 = new Manager();
		
		disPlayInformation(emp);
		/*disPlayInformation(emp2);*/
		
		
	}
	
	public static void disPlayInformation(Employee  emp)
	{
		emp.role();
		int salary = emp.getSalary();
		System.out.println("Salary :"+salary);
		emp.getEmployeeDetails();

	}

}
