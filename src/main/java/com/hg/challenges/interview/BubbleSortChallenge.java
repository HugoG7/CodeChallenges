package com.hg.challenges.interview;

//DONE
public class BubbleSortChallenge {

	public static void main(String[] args) {
		int[] arr = {2,5,3,4,1};
		bubbleSorting(arr);
	}
	
	static void bubbleSorting(int[] arr) {
		int swaps = 0;
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swaps++;
				}
			}
		}
		
		System.out.println("Array is sorted in " + swaps + " swaps.");
		System.out.println("First Element: " + arr[0]);
		System.out.println("Last Element: " + arr[n-1]);
	}
}
