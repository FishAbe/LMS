package lms.business;

import java.util.ArrayList;
import java.util.List;


public class Service {
 
	public static  Employee getUser(String userName, String password) {
		Employee emp=new Employee("fisseha", "Abebe", "x", "x", EmployeeRole.ADMIN);
		Employee emp2=new Employee("fisseha", "Abebe", "y", "y", EmployeeRole.LIBRARIAN);
		Employee emp3=new Employee("fisseha", "Abebe", "z", "z", EmployeeRole.BOTH);
		List<Employee> employees= new ArrayList<>();
		employees.add(emp);
		employees.add(emp2);
		employees.add(emp3);
		List<Employee> users = employees;
		for (Employee emploe:users) {
			if (emploe.getPassword().equals(userName) && emploe.getPassword().equals(password)) {
				return emploe;
			}
		}
		return null;
	}
	
}
