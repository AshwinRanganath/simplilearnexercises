package com.simplilearn.calculator;
import java.util.*;

public class SimpleCalculator {
	
	//add method
	public static int add(int x, int y) {
		int result = x+y;
		System.out.println("Sum of "+x+" and "+y+" is :");
		return result;
	}
	
	//subtract method
	public static int subtract(int x, int y) {
		int result = x-y;
		System.out.println("Difference between "+x+" and "+y+" is :");
		return result;
	}
	
	//multiply method
	public static double multiply(double x,double y) {
		double result = x*y;
		System.out.println("Product of "+x+" and "+y+" is :");
		return result;
	}
	
	//divide method
	public static double divide(double x, double y) {
		double result = x/y;
		System.out.println("Sum of "+x+" and "+y+" is :");
		return result;
	}

	public static void main(String[] args) {
		
		int num1, num2;
		System.out.println("--------Simple Calculator--------");
		System.out.println("1: Addition");
		System.out.println("2: Subtraction");
		System.out.println("3: Multiplication");
		System.out.println("4: Division");
		
		//User input
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers :");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		System.out.println("Enter your choice to perform specific operation");
		int result = scan.nextInt();
		
		//Arithmetic operations based on user input
		switch(result) {
		case 1:
			System.out.println(add(num1, num2));
			break;
		case 2:
			System.out.println(subtract(num1, num2));
			break;
		case 3:
			System.out.println(multiply(num1, num2));
			break;
		case 4:
			System.out.println(divide(num1, num2));
			break;
			default:
				System.out.println("Invalid entry, please select valid option");

		}
		scan.close();	
	}

}
