package com.hg.challenges.algorithms.sorting;

import java.util.Arrays;

/** BIG O: O(n log n)  - Reason: most used sorting algorithms, especially for big data volumes **/
public class QuickSort {

	public static void main(String[] args){
		int[] numbers = {5, 9, 4, 6, 5, 3};
		System.out.println(Arrays.toString(numbers));
		sorting(numbers);
		System.out.println(Arrays.toString(numbers));
	}
	
	
	static void sorting(int[] arr) {
		quickSort(arr, 0, arr.length - 1);
	}
	
	static void quickSort(int[] arr, int initIndex, int lastIndex) {
		int partition = getPartition(arr, initIndex, lastIndex);
		System.out.println("PARTITION - " + partition);
		
		if(initIndex < partition - 1) {
			quickSort(arr, initIndex, partition - 1);
		}
		
		if(lastIndex > partition) {
			quickSort(arr, partition, lastIndex);
		}
	}
	
	static int getPartition(int[] arr, int leftBound, int rightBound) {
		
		int pivot = arr[leftBound];
		System.out.println("PIVOT - " + pivot);
		
		// while -> 0 <= 5 
		// while -> 1 <= 4 
		while(leftBound <= rightBound) {
			System.out.println(leftBound + " - TIMES - " + rightBound);
			
			//searching number which is greater than pivot, bottom up
			while(arr[leftBound] < pivot) {
				leftBound++;
			}
			
			 //searching number which is less than pivot, top down
			while(arr[rightBound] > pivot) {
				rightBound--;
			}
			
			//swap the values
			if(leftBound <= rightBound) {
				int tmp = arr[leftBound];
				arr[leftBound] = arr[rightBound];
				arr[rightBound] = tmp;
				
				leftBound++;
				rightBound--;
			}
		}
		
		return leftBound;
	}
}
