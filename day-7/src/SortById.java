import java.util.Comparator;


public class SortById implements Comparator<Student>{

	@Override
	public int compare(Student std1, Student std2) {
		
		if(std1.getStudentId() == std2.getStudentId())
		{
			return 0;
		}
		else if (std1.getStudentId() > std2.getStudentId())
		{
			return 1;
		}
		else
			return -1;
	}

}
