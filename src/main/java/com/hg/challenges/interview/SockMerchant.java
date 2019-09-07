package com.hg.challenges.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//DONE
public class SockMerchant {
	public static void main(String[] args) {
		int[] socks = {10,20,20,10,10,30,50,10,20};
		int pairs = sockMerchantPairs(socks.length, socks);
		
		System.out.println("Number of pairs: " + pairs);
	}
	
	static int sockMerchantPairs(int n, int[] arr) {
		int pairs = 0;
		int[] socksArr = Arrays.copyOf(arr, arr.length);
		while(socksArr.length > 0) {
			List<Integer> list = Arrays.stream(socksArr).boxed().collect(Collectors.toList());
			
			int pairRoot = socksArr[0];
			list.remove(0);
			int pairIndex = list.indexOf(pairRoot);
			if(pairIndex != -1) {
				list.remove(pairIndex);
				pairs++;
			}
			
			socksArr = list.stream()
	                .mapToInt(Integer::intValue)
	                .toArray();
		}
		return pairs;
	}
}
