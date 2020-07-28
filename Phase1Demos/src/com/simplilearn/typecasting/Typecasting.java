package com.simplilearn.typecasting;
import java.util.*;
import java.util.Scanner;

public class Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int numInt = scan.nextInt();
		//impicit type casting
		float numFLoat = numInt;
		double numDouble = numInt;
		//explicit type casting
		byte numByte = (byte)numInt;
		System.out.println("Entered Integer: "+numInt);
		System.out.println("-------Converted values below-------");
		System.out.println("Float value - "+numFLoat);
		System.out.println("Double value - "+numDouble);
		System.out.println("Byte value - "+numByte);
		System.out.println("Note: If the entered value is out of the range -128 to 127, byte value is not accepted and garbage value is displayed");
	}
}
