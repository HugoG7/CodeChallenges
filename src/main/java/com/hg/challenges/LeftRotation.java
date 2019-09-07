package com.hg.challenges;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LeftRotation {
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5};
		int[] result = doLeftRotation2(arr, 5);
		System.out.println("Original Arr => " + Arrays.toString(arr));
		System.out.println("New Arr => " + Arrays.toString(result));
	}
	
	//BEST SOLUTION - BETTER COMPLEXITY
	static int[] doLeftRotation2(int[] arr, int d){
		List<Integer> helperList = Arrays.stream(arr).boxed().collect(Collectors.toList());

		for(int rot = 1; rot <= d; rot++){
			int aux = helperList.get(0);
			helperList.remove(0);
			helperList.add(aux);
		}
		
		int[] newArr = helperList.stream()
                .mapToInt(Integer::intValue)
                .toArray();

		
		return newArr;
	}
	
	//SOLUTION WORKS - WORST COMPLEXITY
	static int[] doLeftRotation1(int[] arr, int d){
		int[] newArr = Arrays.copyOf(arr, arr.length);
		for(int rot = 1; rot <= d; rot++){
			int aux = newArr[0];
			for(int i = 0; i < newArr.length; i++){
				newArr[i] = i == (newArr.length - 1) ? aux : newArr[i+1];
			}
		}
		
		return newArr;
	}
}

// 0 1 2 3 4  index
//[1,2,3,4,5] d=1
//[2,3,4,5,1] d=2
//[3,4,5,1,2] result