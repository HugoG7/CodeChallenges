package com.hg.challenges.interview;

public class CountingValleys {

	public static void main(String[] args) {
		//String path = "UDDDUDUU"; Expected 1
		String path = "DDUDUDDUDDUDDUUUUDUDDDUUDDUUDDDUUDDUUUUUUDUDDDDUDDUUDUUDUDUUUDUUUUUDDUDDDDUDDUDDDDUUUUDUUDUUDUUDUDDD"; //Expected 5
		String path2 ="DDUDUDDUDDUDD"; //Expected 2
		int valleys = countValleys(path.length(), path);
		int valleys2 = countValleys(path2.length(), path2);
		System.out.println("Valeys => " + valleys);
		System.out.println("Valeys2 => " + valleys2);
	}
	
	static int countValleys(int n, String path) {
		int seaLevel = 0;
		int valleys = 0;
		boolean belowSea = false;
		
		char[] steps = path.toCharArray();
		for(int step = 0; step < steps.length; step++) {
			if(steps[step] == 'U') {
				//U-Up
				seaLevel++;
			}else {
				//D-Down
				seaLevel--;
			}
			
			if(!belowSea && seaLevel < 0) {
				valleys++;
				belowSea = true;
			}
			
			if(seaLevel >= 0){
				belowSea = false;
			}
		}
		
		return valleys;
	}
	
	static int countValleys2(int n, String path) {
		int seaLevel = 0;
		int valleys = 0;
		char lastStep = Character.MIN_VALUE;
		
		char[] steps = path.toCharArray();
		for(int step = 0; step < steps.length; step++) {
			if(steps[step] == 'U') {
				//U-Up
				seaLevel++;
			}else {
				//D-Down
				seaLevel--;
				
				if(seaLevel < 0 && lastStep == steps[step]){
					valleys++;
				}
			}
			
			lastStep = steps[step];
		}
		
		return valleys;
	}
	
	static int countValleys1(int n, String path) {
		int seaLevel = 0;
		int valleys = 0;
		boolean hasSeaLevelReached = true;
		
		char[] steps = path.toCharArray();
		for(int step = 0; step < steps.length; step++) {
			if(steps[step] == 'U') {
				//U-Up
				seaLevel++;
			}else {
				//D-Down
				seaLevel--;
			}
			
			if(hasSeaLevelReached && seaLevel < 0 && (Math.abs(seaLevel) % 2) == 0) {
				valleys++;
				hasSeaLevelReached = false;
			}else if(seaLevel == 0) {
				hasSeaLevelReached = true;
			}
		}
		
		return valleys;
	}
}

//UDDDUDUU
//  _/\      _
//	   \    /
// 	    \/\/


//DDUDUDD
//  _ 
//   \    
//    \/\/\
//		   \