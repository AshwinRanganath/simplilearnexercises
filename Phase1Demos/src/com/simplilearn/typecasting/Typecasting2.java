package com.simplilearn.typecasting;
import java.util.Scanner;

public class Typecasting2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number: ");
		String userInput = scan.nextLine();
		int cInt = Integer.parseInt(userInput);
		byte cByte = Byte.parseByte(userInput);
		float cFloat = Float.parseFloat(userInput);
		double cDouble = Double.parseDouble(userInput);
		System.out.println("Note: If the entered value is out of the range -128 to 127, byte value is not accepted and an exception is caught");
		System.out.println("Integer value - "+cInt);
		System.out.println("Byte value - "+cByte);
		System.out.println("Float value - "+cFloat);
		System.out.println("Double value - "+cDouble);
	}

}
