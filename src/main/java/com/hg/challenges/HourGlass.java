package com.hg.challenges;

public class HourGlass {

	public static void main(String[] args) throws Exception {
		int [][] matrix = {
				{0, -4, -6, 0, -7, -6},
				{-1, -2, -6, -8, -3, -1},
				{-8, -4, -2, -8, -8, -6},
				{-3, -1, -2, -5, -7, -4},
				{-3, -5, -3, -6, -6, -6},
				{-3, -6, 0, -8, -6, -7}
		};
		
		int maxSum = hourGlassSum(matrix);
		System.out.println("Max SUM => " + maxSum);
	}
	
	
	static int hourGlassSum(int[][] matrix) throws Exception {
		if(matrix.length < 1 || matrix.length < 6) {
			throw new Exception("MATRIX doesnt have the correct dimensions [" + matrix.length + "]x6");
		}
		
		for(int i = 0; i < matrix.length; i++) {
			if(matrix[i].length < 1 || matrix[i].length < 6) {
				throw new Exception("MATRIX doesnt have the correct dimensions 6x[" + matrix[i].length + "]");
			}
		}
		
		int maxHourGlassesPerMatrix = 16;
		
		int row = 1;
		int column = 1;
		
		int maxSum = 0;
		boolean firstSum = true;
		while((column * row) <= maxHourGlassesPerMatrix) {
			int tempSum = 0;
			tempSum += checkCorrectInputValue(matrix[row - 1][column - 1]);
			tempSum += checkCorrectInputValue(matrix[row - 1][column]);
			tempSum += checkCorrectInputValue(matrix[row - 1][column + 1]);
			
			tempSum += checkCorrectInputValue(matrix[row][column]);
			
			tempSum += checkCorrectInputValue(matrix[row + 1][column - 1]);
			tempSum += checkCorrectInputValue(matrix[row + 1][column]);
			tempSum += checkCorrectInputValue(matrix[row + 1][column + 1]);
			
			System.out.println("ROW: " + row + ", COL: " + column + ", SUM: " + tempSum);

			if(firstSum) {
				firstSum = false;
				maxSum = tempSum;
			}
			
			if(tempSum > maxSum) {
				maxSum = tempSum;
			}
			
			if(column == 4 && row < 4) {
				row++;
				column = 1;
			}else {
				column++;
			}			
		}
		return maxSum;
    }
	
	static int checkCorrectInputValue(int value) throws Exception {
		if(value < -10 || value > 9) {
			throw new Exception("Input VALUE incorrect => " + value);
		}
		
		return value;
	}
}
