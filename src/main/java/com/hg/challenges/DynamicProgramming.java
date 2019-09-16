package com.hg.challenges;

public class DynamicProgramming {

	public static void main(String[] args){
		int target = 9;
		System.out.println("Fibo result: " + fiboDynamic(target));
	}
	
	static int fiboDynamic(int n){
		int[] f = new int[n+2];
		int i;
		
		f[0] = 0;
		f[1] = 1;
		
		for(i = 2; i <= n; i++){
			f[i] = f[i-1] + f[i-2];
		}
		
		return f[n];
	}
}
