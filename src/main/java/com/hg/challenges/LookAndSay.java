package com.hg.challenges;
/** DONE **/
public class LookAndSay {

	public static void main(String[] args) {
		doLookAndSay(15);
	}
	
	static void doLookAndSay(int maxCount) {
		
		String lastSerie = "1";
		for(int i = 1; i <= maxCount; i++) {
			System.out.println(lastSerie);
			lastSerie = getNextSerie(lastSerie);
		}
	}
	
	static String getNextSerie(String lastSerie) {
		int sum = 0;
		int lastNum = getIntValueFromChar(lastSerie.charAt(0));
		
		String currentSerie = "";
		for(int i = 0; i < lastSerie.length(); i++) {
			int currentNum = getIntValueFromChar(lastSerie.charAt(i));
			
			if(currentNum == lastNum) {
				sum += 1;
			}else {
				currentSerie = currentSerie.concat(String.valueOf(sum)).concat(String.valueOf(lastNum));
				sum=1;
			}
			lastNum = currentNum;
		}
		
		currentSerie = currentSerie.concat(String.valueOf(sum)).concat(String.valueOf(lastNum));
		return currentSerie;
	}
	
	static int getIntValueFromChar(char x) {
		return  Integer.valueOf(String.valueOf(x));
	}
}

//Veces que se repite + El numero
//1
//11
//21
//1211
//111221
//312211
//13112221

