package com.hg.challenges.algorithms.searching;

public class BinarySeachTree {
	class Node {
		int key;
		Node left, right;
		
		public Node(int key){
			this.key = key;
			left = right = null;
		}
	}
	
	Node root;
	
	public BinarySeachTree() {
		root = null;
	}
	
	public void insert(int key){
		root = insertRecursive(root, key);
	}
	
	private Node insertRecursive(Node root, int key){
		if(root == null){
			root = new Node(key);
			return root;
		}
		
		if(key < root.key){
			//If key is lesser than Root, then put key to the left side of the root node
			root.left = insertRecursive(root.left, key);
		}else if(key > root.key){
			//If key is greater than Root, then put key to the right side of the root node
			root.right = insertRecursive(root.right, key);
		}
		
		return root;
	}
	
	public void inOrder(){
		inOrderRecursive(root);
	}
	
	private void inOrderRecursive(Node root){
		if (root != null) { 
			inOrderRecursive(root.left);
			System.out.println("[" + root.key + "]");
			inOrderRecursive(root.right);
		}
	}
	
	public Node search(int key){
		return searchRecursive(root, key);
	}
	
	public Node searchRecursive(Node root, int key){
		if(root == null || root.key == key){
			return root;
		}
		
		if(root.key > key){
			return searchRecursive(root.left, key);
		}
		
		return searchRecursive(root.right, key);
	}
	
	
	public static void main(String[] args){
		BinarySeachTree bst = new BinarySeachTree();
		bst.insert(50);
		bst.insert(10);
		bst.insert(30);
		bst.insert(40);
		bst.insert(55);
		bst.insert(20);
		
		bst.inOrder();
		
		Node n100 = bst.search(100);
		System.out.println("Search NODE[n100] => " + n100.key);
	}
}
