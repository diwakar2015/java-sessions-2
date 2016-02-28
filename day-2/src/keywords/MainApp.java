package keywords;

import com.myco.dept.Employee;

public class MainApp {

	public static void main(String[] args) {


		Employee emp = new Employee();

		emp.empId = 1;
		emp.empName = "Peter";
		emp.salary = 4000;


		Employee emp1 = new Employee();
		emp1.empId = 1;
		emp1.empName = "Peter";
		emp1.salary = 4000;


		emp.displayInformation();
		String band = emp.getSalaryBand();
		System.out.println("Salary band : "+ band);
		
		



	}

}
