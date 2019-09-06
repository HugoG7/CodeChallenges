package com.hg.challenges;

public class ChaoticQueue {

	public static void main(String[] args){
		int[] queue = {2,1,5,3,4};
		int[] queue2 = {1,5,2,3,4};
		int[] queue3 = {1,2,5,3,7,8,6,4};
		//minimumBribes(queue);
		//minimumBribes(queue2);
		minimumBribes(queue3);
	}
	
	static void minimumBribes(int[] queue){
		int maxBribesPerPerson = 2;
		int totalBribes = 0;
		
		for(int pos = 1; pos <= queue.length; pos++){
			int person = queue[pos-1];
			int diff = person - pos;

			if(diff > maxBribesPerPerson){
				System.out.println("Too chaotic!");
				return;
			}
			
			
			if(diff < 0 && pos < queue.length  && person > queue[pos]){
				diff = Math.abs(diff);
			}
			
			if(diff > 0){
				totalBribes += diff;
			}
		}
		
		System.out.println(totalBribes);
	}
}

//ORIGINAL 1,2,3,4,5
//FINAL	   2,1,5,3,4

//ORIGINAL 1 2 3 4 5 6 7 8
//1		   1 2 3 5 4 6 7 8
//2		   1 2 5 3 4 6 7 8
//3		   1 2 5 3 4 7 6 8
//4		   1 2 5 3 7 4 6 8
//5		   1 2 5 3 7 4 8 6
//6		   1 2 5 3 7 8 4 6
//FINAL	   1 2 5 3 7 8 6 4
//         0 0 2 0 2 2 1 0