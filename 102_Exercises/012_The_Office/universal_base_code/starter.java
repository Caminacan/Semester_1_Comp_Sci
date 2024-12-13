/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		//Employees
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		Employee pam = new Employee(2011, "Pam", "Beesly", 2250.00);
		Employee ryan = new Employee(3526, "Ryan", "Kim", 1500.00);
		// Raise
		dwight.raiseSalary(10);
		jim.raiseSalary(20);
		pam.raiseSalary(20);
		ryan.raiseSalary(10);
		//Print
		dwight.employeeToString();
		System.out.println("Dwight's Annual Salary is: " + dwight.getAnnualSalary());
		jim.employeeToString();
		System.out.println("Jim's Annual Salary is: " + jim.getAnnualSalary());
		pam.employeeToString();
		System.out.println("Pam's Annual Salary is: " + pam.getAnnualSalary());
		ryan.employeeToString();
		System.out.println("Ryan's Annual Salary is: " + ryan.getAnnualSalary());
		
	}
}
