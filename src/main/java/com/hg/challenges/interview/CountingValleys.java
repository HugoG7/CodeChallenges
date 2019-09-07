package com.hg.challenges.interview;

public class CountingValleys {

	public static void main(String[] args) {
		//String path = "UDDDUDUU"; Expected 1
		//String path = "DDUDUDDUDDUDDUUUUDUDDDUUDDUUDDDUUDDUUUUUUDUDDDDUDDUUDUUDUDUUUDUUUUUDDUDDDDUDDUDDDDUUUUDUUDUUDUUDUDDD"; //Expected 5
		String path = "DDUDUDD"; //Expected 2
		int valleys = countValleys(path.length(), path);
		System.out.println("Valeys => " + valleys);
	}
	
	static int countValleys(int n, String path) {
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
			
			if(hasSeaLevelReached && seaLevel <= -2) {
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