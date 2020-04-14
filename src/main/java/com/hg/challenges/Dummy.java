package com.hg.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Dummy {

	public static void main(String[] args) {
		Integer[] arr = {1,3,4,5,6};
		
		List<Integer> list = new ArrayList<>();
		Collections.addAll(list, arr);
		
		List<Integer> list2 = Arrays.asList(arr);
		
		
		System.out.println(Arrays.toString(list.toArray()));
		System.out.println(Arrays.toString(list2.toArray()));
	}
}
