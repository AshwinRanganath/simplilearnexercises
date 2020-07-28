package com.simplilearn.testaccessmodifiers;

import com.simplilearn.accessmodifiers.AccessModifiers1;

public class TestEmployee{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifiers1 ams = new AccessModifiers1();
		System.out.println("Employee ID is: "+ams.getID());
		System.out.println("Employee Name is: "+ams.getEmployeeName());
		ams.showSalary(); // this explains the accessibility of protected modifier
	}
}
