package com.hg.challenges;

import java.util.Arrays;
import java.util.LinkedList;

public class Reverse {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(7);
		
		System.out.println(Arrays.toString(list.toArray()));
		
		list = reverseList(list);
		
		System.out.println(Arrays.toString(list.toArray()));
	}
	
	//O(n2)
	static LinkedList<Integer> reverseList(LinkedList<Integer> list) {
		LinkedList<Integer> newList = new LinkedList<Integer>();
		for(int i = 1; i <= list.size(); i++) {
			newList.add(list.get(list.size() - i));
		}
		
		return newList;
	}
	
	
	//O(n)
	static LinkedList<Integer> reverseList2(LinkedList<Integer> list) {
		LinkedList<Integer> newList = new LinkedList<Integer>();
		for(Integer item : list) {
			newList.addFirst(item);
		}
		
		return newList;
	}
}
