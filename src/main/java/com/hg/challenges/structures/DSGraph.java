package com.hg.challenges.structures;

import java.util.Iterator;
import java.util.LinkedList;
/** GRAPH Data-structure Including BFS & DFS */
public class DSGraph {
	
	public static void main(String[] args){
		Graph graph = new Graph(4);
		
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 2);
		graph.addEdge(2, 0);
		graph.addEdge(2, 3);
		graph.addEdge(3, 3);
		
		graph.DFS(2);
		System.out.println("\n--");
		graph.DFSStack(2);
	}
}

class Graph {
	private int vertices;
	private LinkedList<Integer> edges[];
	
	public Graph(int vertices) {
		this.vertices = vertices;
		edges = new LinkedList[vertices];
		for(int i = 0; i < vertices; i++){
			edges[i] = new LinkedList<>();
		}
	}
	
	void addEdge(int v, int w){
		edges[v].add(w);
	}
	
	void DFSStack(int vertex){
		boolean[] visited = new boolean[vertices];
		
		LinkedList<Integer> stack = new LinkedList<>();
		visited[vertex] = true;
		stack.add(vertex);
		
		while(stack.size() != 0){
			int head = stack.removeLast();
			System.out.print(head + ", ");
			
			Iterator<Integer> i = edges[head].listIterator();
			while(i.hasNext()){
				int n = i.next();
				if(!visited[n]){
					visited[n] = true;
					stack.add(n);
				}
			}
		}
	}
	
	//depth first search => Childrens first then siblings = STACK
	void DFS(int vertex) {
		boolean[] visited = new boolean[vertices];
		DFSHelper(vertex, visited);
	}
	
	private void DFSHelper(int vertex, boolean visited[]){
		visited[vertex] = true;
		System.out.print(vertex + ", ");
		
		Iterator<Integer> i = edges[vertex].listIterator();
		while(i.hasNext()){
			int n = i.next();
			if(!visited[n]){
				DFSHelper(n, visited);
			}
		}
	}
	
	//breadth first search => Siblings first then childrens = QUEUE
	void BFS(int vertex) {
		boolean[] visited = new boolean[vertices];
		
		LinkedList<Integer> queue = new LinkedList<>();
		visited[vertex] = true;
		queue.add(vertex);
		
		while(queue.size() != 0){
			int s = queue.poll();
			System.out.print(s + ", ");
			
			Iterator<Integer> i = edges[s].listIterator();
			while(i.hasNext()){
				int n = i.next();
				if(!visited[n]){
					visited[n] = true;
					queue.add(n);
				}
			}
		}
	}
}
