package com.hg.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AmazonGoStores {
	static class Node {
		int x;
		int y;
		
		Node(int x, int y){
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) {
		List<List<Integer>> grid = new ArrayList<>();
		fillGrid(grid);
		
		int rows = grid.size();
		int columns = grid.get(0).size();
		
		
		int result = solution(grid, rows, columns);
		System.out.println("[Solution Result]: " + result);
	}
	
	
	private static int solution(List<List<Integer>> grid, int rows, int columns) {
		Integer[][] matrix = listConvertToMatrix(grid, rows, columns);
		printMatrix(matrix);
		
		return 0;
	}
	
	
	/** Functional Methods **/
	private static void bfs(Integer[][] matrix, Node startNode) {
		boolean[][] visited = new boolean[matrix.length][matrix[0].length];
		Queue<Node> queue = new LinkedList<>();
		
		visited[startNode.x][startNode.y] = true;
		queue.add(startNode);
		
		while(!queue.isEmpty()) {
			
			
		}
	}
	
	private static void bfs(Integer[][] matrix, Node startNode) {
		boolean[][] visited = new boolean[matrix.length][matrix[0].length];
		Queue<Node> queue = new LinkedList<>();
		
		visited[startNode.x][startNode.y] = true;
		queue.add(startNode);
		
		while(!queue.isEmpty()) {
			
			
		}
	}
	
	
	/** Util Methods **/
	private static void fillGrid(List<List<Integer>> grid) {
		grid.add(Arrays.asList(1, 1, 0, 0));
		grid.add(Arrays.asList(0, 0, 0, 0));
		grid.add(Arrays.asList(0, 0, 1, 1));
		grid.add(Arrays.asList(0, 0, 0, 0));
	}
	
	
	private static Integer[][] listConvertToMatrix(List<List<Integer>> grid, int rows, int columns){
		Integer[][] matrix = new Integer[rows][columns];
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				matrix[i][j] = grid.get(i).get(j);
			}
		}
		
		return matrix;
	}
	
	
	private static void printMatrix(Integer[][] matrix){
		System.out.println("[Printing Matrix]: [");
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + ",");
			}
			System.out.println("");
		}
		
		System.out.println("]");
	}
	
}
