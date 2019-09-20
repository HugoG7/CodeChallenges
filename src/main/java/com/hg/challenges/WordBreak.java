package com.hg.challenges;

import java.util.Arrays;
import java.util.List;

public class WordBreak {

	public static void main(String[] args){
		// List of Strings to represent dictionary
		List<String> dict = Arrays.asList("this", "th", "is", "famous",
											"Word", "break", "b", "r", "e", "a", "k",
											"br", "bre", "brea", "ak", "problem");

		// input String
		String str = "Wordbreakproblem";
		wordBreak(dict, str, "");
	}
	
	public static void wordBreak(List<String> dict, String str, String out){
		if (str.length() == 0)
		{
			System.out.println(out);
			return;
		}

		for (int i = 1; i <= str.length(); i++)
		{
			// consider all prefixes of current String
			String prefix = str.substring(0, i);
			System.out.println("PREFIX; " + prefix);

			// if the prefix is present in the dictionary, add prefix to the
			// output String and recur for remaining String
		
			if (dict.contains(prefix)) {
				System.out.println("EXISTS");
				wordBreak(dict, str.substring(i), out + " " + prefix);
			}
		}
	}
}
