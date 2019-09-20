package com.hg.challenges.interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AllSubsets {

	public static void main(String[] args) {
		Set<Integer> s = new HashSet<>();
		s.add(1);
		s.add(2);
		s.add(3); //s.add(2); SET DOESNT ALLOW REPEAT NUMBERS
		
		findAllSubsets(s);
	}
	
	static void findAllSubsets(Set<Integer> s) {
		Integer[] givenArr = s.toArray(new Integer[0]); 
		Integer[] subset = new Integer[givenArr.length];
		helperFind(givenArr, subset, 0);
	}
	
	static void helperFind(Integer[] givenArr, Integer[] subset, int i) {
		if(givenArr.length == i) {
			printSubset(subset);
		}
		else {
			subset[i] = null;
			helperFind(givenArr, subset, i + 1);
			subset[i] = givenArr[i];
			helperFind(givenArr, subset, i + 1);
		}
	}
	
	static void printSubset(Integer[] subset) {
		System.out.println(Arrays.toString(subset));
	}
}
