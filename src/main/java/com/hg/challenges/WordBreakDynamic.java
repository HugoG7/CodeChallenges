package com.hg.challenges;

import java.util.Arrays;
import java.util.List;

public class WordBreakDynamic {

	public static void main(String[] args){
		// List of Strings to represent dictionary
		List<String> dict = Arrays.asList("this", "th", "is", "famous",
											"Word", "break", "b", "r", "e", "a", "k",
											"br", "bre", "brea", "ak", "problem");

		// input String
		String str = "Wordbreakproblem";
		int[] lookup = new int[str.length() + 1];
		Arrays.fill(lookup, -1);
		System.out.println("Can this string break down in words? => " + wordBreak(dict, str, lookup));
	}
	
	public static boolean wordBreak(List<String> dict, String str, int[] lookup){
		int n = str.length();
		
		if (n == 0){
			return true;
		}
		System.out.println("N: " + n + ", Str: " + str);
		if(lookup[n] == -1){
			lookup[n] = 0;
			for (int i = 1; i <= n; i++)
			{
				// consider all prefixes of current String
				String prefix = str.substring(0, i);
				System.out.println("PREFIX; " + prefix);

				// if the prefix is present in the dictionary, add prefix to the
				// output String and recur for remaining String
			
				if (dict.contains(prefix) && wordBreak(dict, str.substring(i), lookup)) {
					lookup[n] = 0;
					return true;
				}
			}
		}

		System.out.println("LOOK: " + lookup[n]);
		return lookup[n] == 1;
	}
}
