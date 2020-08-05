package com.simplilearn.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSetNumeric {

	public static void main(String[] args) {
		// Set is a child interface in Collection
		// Set do not store duplicate values
		// Implementation class : HashSet , LinkendHashSet, TreeSet
		
		// HashSet: Uses hash code of the object to store values
		// HashSet is backed by HashTable
		Set<Double> priceSet = new HashSet<>();
		priceSet.add(24999.99);
		priceSet.add(29999.49);
		priceSet.add(39999.49);	
		priceSet.add(49999.99);	
		System.out.println("Hash Set :"+priceSet);
		
		System.out.println("------------------------");
		// It store unique elements
		// preserve the insertion order
		Set<Integer> numberSet = new LinkedHashSet<>();
		numberSet.add(10);
		numberSet.add(20);
		numberSet.add(30);
		numberSet.add(40);
		numberSet.add(50);
		System.out.println("Linked Hash Set :"+numberSet);
		
		System.out.println("------------------------");
		// TreeSet is also a child class for Set
		// Stores unique element
		// Order collection as ascending (sorted set)
		//descendingSet() is used to retrieve descending ordered list
		TreeSet<Float> temperatureSet = new TreeSet<>();
		temperatureSet.add((float) 72.4);
		temperatureSet.add((float) 35.2);
		temperatureSet.add((float) 40.7);
		temperatureSet.add((float) 32.3);
		TreeSet <Float>reverList = (TreeSet)temperatureSet.descendingSet();
		
		System.out.println("Tree Set :"+temperatureSet);
		System.out.println("Reverse Tree Set :"+reverList);
	}

}
