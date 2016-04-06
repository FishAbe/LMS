package lms.business;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import lms.dataaccess.DataAccess;
import lms.dataaccess.DataAccessFacade;

public class Main {
	
	public static void main(String[] args) {
		Employee emp=new Employee("fisseha", "Abebe", "x", "x", EmployeeRole.ADMIN);
		Employee emp2=new Employee("fisseha", "Abebe", "y", "y", EmployeeRole.LIBRARIAN);
		Employee emp3=new Employee("fisseha", "Abebe", "z", "z", EmployeeRole.ADMIN);
		
		
		LibraryMember member = new LibraryMember("John");
		Publication p = new Book(3, "1235","Sample Title");
		LendableCopy c = new LendableCopy();
		c.setPublication(p);
		c.setCopyId(1);
		member.checkout(c, LocalDate.now(), LocalDate.now().plus(30, ChronoUnit.DAYS));
		System.out.println("Location of 'user.dir':\n  "+DataAccessFacade.OUTPUT_DIR);
		DataAccess da = new DataAccessFacade();
		da.saveLibraryMember("Fish", member);
		System.out.println("Reading record for John:\n"+"  "+da.readLibraryMember("Fish"));
		

	}
	

}
