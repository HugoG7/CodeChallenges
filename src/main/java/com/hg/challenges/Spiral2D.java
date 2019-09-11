package com.hg.challenges;

import java.util.LinkedList;

/** DONE!!!!!! JUST BY ME **/
public class Spiral2D {

	public static void main(String[] args) {
		int size = 3;
		int[][] matrix = new int[size][size];
		int aux = 1;
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				matrix[i][j] = aux;
				aux++;
			}
		}
		
		doSpiral(matrix);
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]+ "  ");
			}
			System.out.println("");
		}
	}
	
	static void doSpiral(int[][] matrix) {		
		LinkedList<Integer> numbers = new LinkedList<>();
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				numbers.add(matrix[i][j]);
			}
		}

		int size = matrix.length;
		int count = 0;
		while(count < size) {
			//0,0 --> 0,N	
			for(int i = count; i < (size-1); i++) {
				matrix[count][i] = numbers.poll();
			}
	
			
			//0,N --> N,N
			for(int i = count; i < (size-1); i++) {
				matrix[i][size-1] = numbers.poll();
			}
			
			//N,N --> N,O
			for(int i = (size-1); i > count; i--) {
				matrix[size-1][i] = numbers.poll();
			}
			
			//N,0 --> 0,0
			for(int i = (size-1); i > count; i--) {
				matrix[i][count] = numbers.poll();
			}
			
			size--;
			count++;
		}
		
		if(matrix.length % 2 != 0 && !numbers.isEmpty()) {
			matrix[count -1 ][count -1] = numbers.poll();
		}		
	}
}

//4x4
//01 02 03 04
//12 13 14 05
//11 16 15 06
//10 09 08 07