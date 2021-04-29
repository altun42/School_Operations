package schoolOperations;

public class Instructor extends BasePerson {
	private String majorName;
	public Instructor() {
		
	}

	public Instructor(int id, String lastName, String firstName, String password, String majorName) {
		super(id, lastName, firstName, password);
		this.majorName = majorName;
	}

	public String getMajorName() {
		return majorName;
	}

	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}

}
