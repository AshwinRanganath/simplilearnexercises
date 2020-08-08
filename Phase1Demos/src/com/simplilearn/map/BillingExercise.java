package com.simplilearn.map;
import java.util.*;
public class BillingExercise {

	public static void main(String[] args) {

		TreeMap<Double, String> bill = new TreeMap<Double, String>();
		bill.put (500.00, "Earphone");
		bill.put (20000.00, "XYZ Mobile Phone");
		bill.put (1000.00, "Fast Charger");
		bill.put (15000.00, "Smart Watch");
		//Billing in ascending order
		System.out.println("Bill sorted based on price - Ascending order");
		for (Map.Entry b : bill.entrySet()) {
			System.out.println(b.getKey()+" -> "+b.getValue());
		}
		
		System.out.println();
		System.out.println("--------------------------");
		System.out.println();
		
		//Billing in descending order
		System.out.println("Bill sorted based on price - Descending order");
		Map<Double, String> reverseBill = new TreeMap<>(Collections.reverseOrder());
		reverseBill.putAll(bill);
		for(Map.Entry b : reverseBill.entrySet()) {
			System.out.println(b.getKey()+" -> "+b.getValue());
		}
	}
}
