package com.hg.challenges;
/** NOT DONE **/
public class Spiral2D {

	public static void main(String[] args) {
		printSpiral(4);
	}
	
	static void printSpiral(int size) {
		int[][] matrix = new int[size][size];
		
		int aux = 1;
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				matrix[i][j] = aux;
				aux++;
			}
		}
		
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				System.out.print(matrix[i][j]+ " ");
			}
			System.out.println("");
		}
	}
}

//4x4
//01 02 03 04
//12 13 14 05
//11 16 15 06
//10 09 08 07