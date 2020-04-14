package com.hg.challenges;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SortedSet {
	
	public static void main(String[] args) {
		String text = "GeekForGeeks";
		sortingString(text);
	}

	static void sortingString(String text) {
		Set<String> list = new TreeSet<>();
		
		for(Character c : text.toCharArray()) {
			list.add(c.toString());
		}
	
		System.out.print(Arrays.toString(list.toArray()));
	}
}
