package com.hg.challenges.algorithms.sorting;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int[] arr = {9,8,5,3,1,2};
		
		System.out.println("Before sorting => " + Arrays.toString(arr));
		mergeSort(arr, arr.length);
		System.out.println("After sorting => " + Arrays.toString(arr));
		
	}
	
	static void mergeSort(int[] arr, int n) {
		if(n < 2) {
			return;
		}
		
		int middle = n / 2;
		
		int[] left = new int[middle];
		int[] right = new int[n - middle];
		
		for(int i = 0; i < middle; i++) {
			left[i] = arr[i];
		}
		
		for(int i = middle; i < n; i++) {
			right[i - middle] = arr[i];
		}
		
		mergeSort(left, middle);
		mergeSort(right, n - middle);
		
		
		merge(arr, left, right, middle, n-middle);
	}
	
	static void merge(int[] arr, int[] left, int[] right, int l, int r) {
		int i = 0, j = 0, k = 0;
		while(i < l && j < r) {
			if(left[i] <= right[j]) {
				arr[k++] = left[i++];
			}else {
				arr[k++] = right[j++];
			}
		}
		
		//Remaining left elements
		while(i < l) {
			arr[k++] = left[i++];
		}
		
		//Remaining right elements
		while(j < r) {
			arr[k++] = right[j++];
		}
	}

}
