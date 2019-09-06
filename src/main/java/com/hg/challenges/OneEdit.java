package com.hg.challenges;
/** DONE **/
public class OneEdit {

	public static void main(String[] args) {
		System.out.println("Is this pair of words 'One edit' away? => " + isOneEdit("cat", "dog") );
		System.out.println("Is this pair of words 'One edit' away? => " + isOneEdit("cat", "cats") );
		System.out.println("Is this pair of words 'One edit' away? => " + isOneEdit("cat", "cut") );
		System.out.println("Is this pair of words 'One edit' away? => " + isOneEdit("cat", "cast") );
		System.out.println("Is this pair of words 'One edit' away? => " + isOneEdit("cat", "at") );
		System.out.println("Is this pair of words 'One edit' away? => " + isOneEdit("cat", "act") );
		System.out.println("Is this pair of words 'One edit' away? => " + isOneEdit("cat", "amo") );
		System.out.println("Is this pair of words 'One edit' away? => " + isOneEdit("cat", "cap") );
	}
	
	static boolean isOneEdit(String word1, String word2) {
		int auxOneCharReplaced = 0;
		
		if(word1.length() != word2.length()) {
			//CHAR ADDED OR REMOVED VALIDATION
			int diff = word1.length() - word2.length();
			
			//3 - 2 = 1 REMOVED
			//3 - 4 = -1 INSERTED
			if(!(diff == -1 || diff == 1)) {
				return false;
			}
		}else {
			//CHAR REPLACED VALIDATION
			for(int i = 0; i < word1.length(); i++) {
				auxOneCharReplaced += word1.charAt(i) == word2.charAt(i) ? 0 : 1;
				if(auxOneCharReplaced > 1) {	
					return false;
				}
			}
			
		}
		
		
		return true;
	}
}
