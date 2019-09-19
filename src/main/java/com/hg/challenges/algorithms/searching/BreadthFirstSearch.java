package com.hg.challenges.algorithms.searching;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
 
//FIFO -> First in first out QUEUE
public class BreadthFirstSearch {
	
	static class Node {
		int x;
		int y;
		
		Node(int x, int y){
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args){
		int[][] matrix = {{0,0,0,-1,-2},
						  {0,-2,0,0,0}};
		
		BFS(matrix, new Node(0, 4));
		
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				System.out.print(matrix[i][j] + ", ");
			}
			System.out.println("");
		}
	}
	
	public static void BFS(int[][] matrix, Node gate){
		boolean[][] visited = new boolean[matrix.length][matrix[0].length];
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(gate);
		visited[gate.x][gate.y] = true;
		
		while(queue.size() != 0){
			boolean isGate = false;
			Node head = queue.poll();
 			List<Node> neighbors = getNeighbors(matrix, head);
 			
 			if(matrix[head.x][head.y] == -2){
 				isGate = true;
 			}
 			
 			int away = isGate ? 1 : matrix[head.x][head.y] + 1;
			for(int i = 0; i < neighbors.size(); i++){
				int x = neighbors.get(i).x;
				int y = neighbors.get(i).y;
				
				if(!visited[x][y]){
					if(matrix[x][y] == 0){
						matrix[x][y] = away;
					}
					visited[x][y] = true;
					queue.add(neighbors.get(i));
				}else if(isGate && matrix[x][y] > 0){
					matrix[x][y] = away;
					queue.add(neighbors.get(i));
				}else if(matrix[x][y] > away){
					matrix[x][y] = away;
					queue.add(neighbors.get(i));
				}
			}			
		}
	}
	
	static List<Node> getNeighbors(int[][] matrix, Node currentNode){
		List<Node> neighbors = new ArrayList<>();
		
		if(isAValidPath(matrix, currentNode.x - 1, currentNode.y)){
			neighbors.add(new Node(currentNode.x - 1, currentNode.y));
		}
		
		if(isAValidPath(matrix, currentNode.x + 1, currentNode.y)){
			neighbors.add(new Node(currentNode.x + 1, currentNode.y));
		}
		
		if(isAValidPath(matrix, currentNode.x, currentNode.y - 1)){
			neighbors.add(new Node(currentNode.x, currentNode.y - 1));
		}
		
		if(isAValidPath(matrix, currentNode.x, currentNode.y + 1)){
			neighbors.add(new Node(currentNode.x, currentNode.y + 1));
		}
		
		return neighbors;
		
	}
	
	static boolean isAValidPath(int[][] matrix, int x, int y){
		return !(x < 0 || x >= matrix.length || y < 0  || y >= matrix[0].length) && matrix[x][y] != -1;
	}	
}