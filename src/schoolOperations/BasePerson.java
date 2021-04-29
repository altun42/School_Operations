package schoolOperations;

public class BasePerson {
	private int ýd;
	private String lastName;
	private String firstName;
	private String password;
	public BasePerson() {
		
	}
	public BasePerson(int id, String lastName, String firstName, String password) {
		super();
		this.ýd = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.password = password;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setId(int id) {
		this.ýd = id;
	}
	
	
	

}
