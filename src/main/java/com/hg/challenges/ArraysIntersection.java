package com.hg.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysIntersection {

	public static void main(String[] args){
		int[] arr1 = {1,2,3,5,6,9};
		int[] arr2 = {2,3,6,7,8,9};
		int[] arr3 = {2,3,6,8,9,10};
		System.out.println("INTERSECTIONS: " + Arrays.toString(intersection(arr1, arr2, arr3).toArray()));
	}
	
	static List<Integer> intersection(int[] arr1, int[] arr2, int[] arr3){
		List<Integer> intersections = new ArrayList<>();
		
		int limit = arr1.length;
		boolean limitReached = false;
		int x = 0, y = 0, z = 0;
		while(!limitReached){
			if(arr1[x] == arr2[y] && arr2[y] == arr3[z]){
				intersections.add(arr1[x]);
				x++;
				y++;
				z++;
			}else{
				if(arr1[x] > arr2[y]){
					y++;
				}else if(arr2[y] > arr3[z]){
					z++;
				}else{
					x++;
				}
			}
			limitReached = (x + 1) > limit || (y + 1) > limit ||(z + 1) > limit;
		}
		
		return intersections;
	}
}
