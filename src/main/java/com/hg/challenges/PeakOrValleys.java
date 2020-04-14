package com.hg.challenges;

public class PeakOrValleys {

	public static int findPeak(int[] arr, int l, int r) {
		int n = arr.length; 
		int middle = l + (r - l) / 2;
		
		if((arr[middle] > arr[middle - 1] && arr[middle] > arr[middle + 1]) ) {
			return middle;
		}else if(arr[middle] < arr[middle + 1]) {
			return findPeak(arr, middle + 1, r);
		} else {
			return findPeak(arr, l, middle - 1);
		}
		

	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,5,7,6,4};
		int high = findPeak(arr, 0, arr.length - 1);
		System.out.println("Higest: "+ high);
	}
}
