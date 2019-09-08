package com.hg.challenges;

public class Factorial {
	public static void main(String[] args){
		System.out.println("Factorial of 6!: " + factorial(6));
		System.out.println("Factorial of 4!: " + factorial(4));
		System.out.println("Factorial of 0!: " + factorial(0));
		System.out.println("Factorial of 1!: " + factorial(1));
		System.out.println("Factorial of 10!: " + factorial(10));
		System.out.println("Factorial of 100!: " + factorial(100));
		
		System.out.println("Recursion Factorial of 6!: " + recursionFactorial(6));
		System.out.println("Recursion Factorial of 4!: " + recursionFactorial(4));
		System.out.println("Recursion Factorial of 0!: " + recursionFactorial(0));
	}
	
	static double factorial(int n){
		double sum = 1;
		for(int i = 1; i <= n; i++){
			sum *= i;
		}
		return sum;
	}
	
	static int recursionFactorial(int n){
		if(n >= 1){
			return n * recursionFactorial(n-1);
		}else{
			return 1;	
		}
	}
}	

