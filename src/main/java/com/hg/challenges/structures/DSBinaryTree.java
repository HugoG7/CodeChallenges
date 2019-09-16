package com.hg.challenges.structures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DSBinaryTree {

	public static void main(String[] main){
		Tree<Double> tree = new Tree<Double>(3D);
		tree.left = new Tree<Double>(9D);
		tree.right = new Tree<Double>(20D);
		tree.right.left = new Tree<Double>(15D);
		tree.right.right = new Tree<Double>(7D);
		
		List<Double> results = new ArrayList<>();
		getAverage(tree, results);
		System.out.println(results);
		
	}
	
	static void getAverage(Tree<Double> tree, List<Double> results){		
		LinkedList<Tree<Double>> queue = new LinkedList<>();
		queue.add(tree);
		
		while(!queue.isEmpty()){
			double sum = 0;
			
			Tree<Double> p;
			int counter = queue.size();
			for(int i = 1; i <= counter; i++){
				p = queue.poll();
				sum += p.value;
				if(p.left != null) queue.add(p.left);
				if(p.right != null) queue.add(p.right);
				
			}
			results.add((sum / counter));
		}
	}
}

class Tree<T> {
	T value;
	Tree<T> left, right;
	
	public Tree(T value){
		this.value = value;
	}
}


//   	3
//     / \
// 	  9   20
//   /\	  / \
//  1 24 15  7

