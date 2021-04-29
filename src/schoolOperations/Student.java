package schoolOperations;

public class Student extends BasePerson {
	private int schoolNumber;
	private int examGrade;
	public Student() {
		
	}
	public Student(int id, String lastName, String firstName, String password, int schoolNumber, int examGrade) {
		super(id, lastName, firstName, password);
		this.schoolNumber = schoolNumber;
		this.examGrade = examGrade;
	}
	public int getSchoolNumber() {
		return schoolNumber;
	}
	public void setSchoolNumber(int schoolNumber) {
		this.schoolNumber = schoolNumber;
	}
	public int getExamGrade() {
		return examGrade;
	}
	

}
