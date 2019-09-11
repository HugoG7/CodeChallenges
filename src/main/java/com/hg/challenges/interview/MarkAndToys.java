package com.hg.challenges.interview;

import java.util.Arrays;

public class MarkAndToys {

	public static void main(String[] args) {
		int[] prices = {1,12,5,111,200,1000,10};
		int budget = 50;
		
		//System.out.println(maximumToys(prices, budget));
		
		String hugo = "Hugo";
		String hogo = "Hogo";
		
		System.out.println(hugo.hashCode());
		System.out.println(hogo.hashCode());
	}
	
	static int maximumToys(int[] prices, int k) {
		//QuickSort
		Arrays.sort(prices);
		
		int sum = 0;
		int count = 0;
		for(int i = 0; i < prices.length; i++) {
			
			if((sum + prices[i]) <= k) {
				sum += prices[i];
				count++;
			}else {
				break;
			}
			
			

		}

		return count;
    }
	
	
	//SOLUTION NON OPTIMAL
	static int maximumToys2(int[] prices, int k) {
		//BubbleSort
		sortArrPrices(prices);
		
		int lastMaxToysCount = 0;
		for(int i = 0; i < prices.length; i++) {
			int toysCount = 1;
			int sum = prices[i];
			
			if(sum > k) {
				break;
			}
			
			
			int a = 1;
			while((sum + prices[a]) <= k) {
				sum += prices[a];
				toysCount++;
				
				a++;
			}

			
			if(toysCount > lastMaxToysCount) {
				lastMaxToysCount = toysCount;
			}
		}

		return lastMaxToysCount;
    }
	
	static void sortArrPrices(int[] prices) {
		int n = prices.length;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n-1; j++) {
				if(prices[j] > prices[j+1]) {
					int aux = prices[j];
					prices[j] = prices[j+1];
					prices[j+1] = aux;
					
				}
			}
		}
	}
}
