package com.hg.challenges;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ShortestSubstring {

	public static int shortest(String s) {
		Set<String> letters = new HashSet<>();
		for(Character c : s.toCharArray()) {
			letters.add(c.toString().toLowerCase());
		}
	
		System.out.println("\nSTRING: " + s);
		System.out.println("LENGTH: " + s.length());
		System.out.println("SET OF CHARS: " + Arrays.toString(letters.toArray()));
		
		String shortestStr = "";
		int shortest = s.length();
		int startIndex = 0;
		int endIndex = letters.size();
		
		while(endIndex <= s.length()) {
			boolean validStr = true;
			int currentLength = 0;
			String currentSbString = s.substring(startIndex, endIndex);
			for(String letter : letters) {
				if(!currentSbString.contains(letter)) {
					validStr = false;
					break;
				}
			}
			
			if(validStr) {
				currentLength = currentSbString.length();
				if(currentLength < shortest) {
					shortestStr = currentSbString;
					shortest = currentLength;
				}
				
				startIndex = endIndex;
				endIndex = endIndex + letters.size();
			}else{
				endIndex++;
			}
			
		}
		
		System.out.println("SUB-STRING: " + shortestStr);
		return shortest;
	}
	
	public static void main(String[] args) {
		System.out.println(shortest("dabbcabcd"));
		System.out.println(shortest("bab"));
	}
}
