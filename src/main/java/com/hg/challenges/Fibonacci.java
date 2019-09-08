package com.hg.challenges;

public class Fibonacci {

	public static void main(String[] args){
		System.out.println("Fibonacci pos 10: " + fibonacci(10));
		printFibonacciSerie(10);
	}
	
	static int fibonacci(int n){
		if(n > 1){
			return fibonacci(n-1) + fibonacci(n-2);
		}else if (n == 1){
			return 1;
		}else{
			return 0;
		}
	}
	
	static void printFibonacciSerie(int limit){
		System.out.print(System.lineSeparator());
		for(int i = 1; i <= limit; i++){
			System.out.print(fibonacci(i) + " ");
		}
	}
}

// 1 1 2 3 5 8 13