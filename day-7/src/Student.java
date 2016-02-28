
public class Student {
	
	private int studentId;
	private String name;
	private String deparment;
	
	public Student() {} 
	
	public Student(int studentId, String name, String deparment) {

		this.studentId = studentId;
		this.name = name;
		this.deparment = deparment;
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDeparment() {
		return deparment;
	}
	public void setDeparment(String deparment) {
		this.deparment = deparment;
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name
				+ ", deparment=" + deparment + "]";
	}

	
}
