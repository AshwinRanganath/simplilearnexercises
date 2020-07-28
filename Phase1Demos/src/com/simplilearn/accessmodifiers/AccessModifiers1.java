package com.simplilearn.accessmodifiers;
import java.util.Scanner;
	
public class AccessModifiers1 {
	private int empID = 1;
	public String empName = "Jones";
	protected double empSalary = 10000.00;
	public int getID() {
		return empID;
	}
	
	public String getEmployeeName() {
		return empName;
	}
	
	protected void showSalary() {
		System.out.println("Employee Salary is : "+empSalary);
	}
	//showSalary() can be accessed in other packages if its visibility is changed to public
	
	public static void main(String[] args) {
		AccessModifiers1 ams = new AccessModifiers1();
		System.out.println("Employee ID is: "+ams.getID());
		System.out.println("Employee Name is: "+ams.getEmployeeName());
		ams.showSalary();
	}
}
