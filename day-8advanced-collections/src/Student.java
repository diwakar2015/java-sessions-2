public class Student {

	private String name;
	private int id;
	private String section;

	public Student() {}

	public Student(int id, String name) {

		this.name = name;
		this.id = id;
	}

	@Override
	public int hashCode() {
		System.out.println("I am inside hashCode ");

		final int prime = 31;

		int hashCode = 1;

		hashCode = prime * hashCode + id;

		System.out.println("HashCode generated : "+ hashCode);

		return hashCode;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("I am inside equals");

		Student std = (Student)obj;

		if(std.getName()!=name)
			return false;
		else 
			return true;
	}
	
	//condityion to become two object same is
	// first, hashCode should be equal
	// equals method hsould return true

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}



}
