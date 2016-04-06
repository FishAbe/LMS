package lms.business;
//comment by solomon

public class Employee {

	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	EmployeeRole employeeRole;
	public Employee(String firstName, String lastName, String userName, String password, EmployeeRole employeeRole) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.employeeRole = employeeRole;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public EmployeeRole getEmployeeRole() {
		return employeeRole;
	}
	public void setEmployeeRole(EmployeeRole employeeRole) {
		this.employeeRole = employeeRole;
	}	
	
}
 