package com.hg.challenges.algorithms.sorting;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {2,5,3,4,1};
		System.out.println("Array before sorting => " + Arrays.toString(arr));
		bubbleSorting(arr);
		System.out.println("Array after sorting => " + Arrays.toString(arr));
	}
	
	
	static void bubbleSorting(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
