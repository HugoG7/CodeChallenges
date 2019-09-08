package com.hg.challenges;

public class Multiples {
	public static void main(String[] args){
		System.out.println("2 es multiplo de 2: " + multiples(2, 2));
		System.out.println("4 es multiplo de 2: " + multiples(4, 2));
		System.out.println("6 es multiplo de 2: " + multiples(6, 2));
		System.out.println("8 es multiplo de 2: " + multiples(8, 2));
		System.out.println("9 es multiplo de 2: " + multiples(9, 2));
	}
	
	static boolean multiples(int a, int b){
		return a % b == 0;
	}
}
