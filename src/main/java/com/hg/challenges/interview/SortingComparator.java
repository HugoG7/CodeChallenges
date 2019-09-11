package com.hg.challenges.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


//DONE
public class SortingComparator {
	
	public static void main(String[] args){
		List<Person> list = new ArrayList<>();
		list.add(new Person(10, "Hugo"));
		list.add(new Person(20, "Ronaldo"));
		list.add(new Person(30, "Messi"));
		list.add(new Person(30, "Kaka"));
	
		Person[] persons = {new Person(20, "Hugo"), new Person(30, "Ronaldo"), new Person(10, "Messi"), new Person(10, "Kaka")};
		System.out.println(Arrays.toString(persons));
		SortComparator comporator = new SortComparator();
		Arrays.sort(persons, comporator);
		System.out.println(Arrays.toString(persons));
		
		
		//Arrays.sort -> QuickSort; in a primitive way
		//List.sort -> MergeSort
	}
	
}

//java.util.Comparator interfaces to sort array/list of custom classes
class SortComparator implements Comparator<Person> { 

	@Override
	public int compare(Person a, Person b) {
		if(a.score > b.score) {
			return 1;
		}
		
		if(a.score < b.score) {
			return -1;
		}
		
		if(a.score == b.score) {
			if(a.name.compareTo(b.name) < 0 ) {
				return -1;
			}else {
				return 1;
			}
		}
		
		return 0;
	}
	
}

//sort an array/list of primitive types and wrapper classes and then we will use java.lang.Comparable
//class SortComparable implements Comparable<Person> { 
//
//	@Override
//	public int compareTo(Person o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//	
//}

class Person {
	int score;
	String name;
	
	public Person(int score, String name) {
		this.score = score;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Person [" + this.score +", " + this.name + "]";
	}
}