package com.hg.challenges.structures;

import java.util.ArrayList;
import java.util.List;

public class DSTrees {

	public static void main(String[] args){
		DSTrees instance = new DSTrees();
		Tree<String> OS = instance.new Tree<String>("UNIX");
		
		Node<String> microsoft = createNode(instance, "MICROSOFT", OS.root);
		Node<String> windows7 = createNode(instance, "WINDOWS 7", microsoft);
		Node<String> windows10 = createNode(instance, "WINDOWS 10", microsoft);
		microsoft.children.add(windows7);
		microsoft.children.add(windows10);
		
		Node<String> linux = createNode(instance, "LINUX", OS.root);
		Node<String> fedora = createNode(instance, "FEDORA", linux);
		Node<String> debian = createNode(instance, "DEBIAN", linux);
		Node<String> ubuntu = createNode(instance, "UBUNTU", debian);
		debian.children.add(ubuntu);
		linux.children.add(fedora);
		linux.children.add(debian);
		
		OS.root.children.add(microsoft);
		OS.root.children.add(linux);
		
		//System.out.print("TREE => " + OS.toString());
		printTree(OS);
	}
	
	
	static void printTree(Tree<String> tree){
		int level = 0;
		System.out.println("[" + level + "][" + tree.root.element + "]");
		printChilds(tree.root.children, level + 1);
	}
	
	static void printChilds(List<Node<String>> childs, int level){
		for(Node<String> node : childs){
			System.out.println("["+level+"][PARENT: "+ node.parent.element + "][" + node.element + "]");
			if(node.children.size() > 0){
				printChilds(node.children, level+1);
			}
		}
	}
	
	static <T> Node<T> createNode(DSTrees instance, T element, Node<T> parent){
		Node<T> newNode = instance.new Node<T>();
		newNode.element = element;
		newNode.parent = parent;
		newNode.children = new ArrayList<Node<T>>(); 
		return newNode;
	}
	
	private class Tree<T> {
		private Node<T> root;
		public Tree(T rootElement){
			root = new Node<T>();
			root.element = rootElement;
			root.children = new ArrayList<Node<T>>();
		}
		
		@Override
		public String toString(){
			return "TREE [" + root.element.toString() + "]";
		}
		
	}
	
	private class Node<T>{
		private T element;
		private Node<T> parent;
		private List<Node<T>> children;
		
		@Override
		public String toString(){
			return "NODE [" + element.toString() + "] => CHILDS[" + children.size() + "]";
		}
	}
}
