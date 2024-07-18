package grpa.w1;

import java.util.Scanner;

class Employee {
	String ename;
	String eid;
	String edept;

	public Employee() {
		ename = "guest";
	}

	// Define the required methods
	public Employee(String name, String id, String dept) {
		this.ename = name;
		this.eid = id;
		this.edept = dept;

	}

	public void copyDept(Employee e2) {
		this.edept = e2.edept; // production
	}

	public void displayDetails() {
		System.out.println("ename : " + ename);
		System.out.println("eid : " + this.eid); //
		System.out.println("edept : " + this.edept);
	}

}

public class Grpa2 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		Employee e1 = new Employee();

		// Enter name of the employee
		String name = s.nextLine();

		// Enter id of the employee
		String id = s.nextLine();

		// Enter department of the employee
		String dept = s.nextLine();
		s.close();

		Employee e2 = new Employee(name, id, dept);

		e1.copyDept(e2);
		// Copies the department name of e2 into e1's department name.

		e1.displayDetails();
	}
}