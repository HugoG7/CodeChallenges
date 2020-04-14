package com.hg.challenges.algorithms.searching;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {-4, -1, 1, 1, 4, 5}; 
		
		int index = search(arr, 0, arr.length - 1, 4);
		System.out.println("Index Found in => " + index);
	}
	
	static int search(int[] arr, int l, int r, int target) {
		if(l < r) {
			int middle = l + (r - l) / 2;
			
			if(arr[middle] == target)
				return middle;
			
			if(arr[middle] > target)
				//LEFT SIDE
				return search(arr, l, middle - 1, target);
			
			//RIGHT SIDE
			return search(arr, middle + 1, r, target);
		}
		
		return -1;
	}
}
	

//[0|1|2|03|04]
//[2|3|4|10|40]

//l = 0, r = 4
//middle = 0 + (4 - 0) / 2 = 2

//l = 3, r = 4
//middle = 3 + (4 - 3) / 2 = 3


