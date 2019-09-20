package com.hg.challenges.structures;

public class LinkedHugoList {
	
	Node head;

	class Node {
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	
	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	
	public void append(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			return;
		}
		
		Node lastNode = head;
		while(lastNode.next != null) {
			lastNode = lastNode.next;
		}
		
		lastNode.next = newNode;
	}
	
	public void insertAfter(Node node, int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			return;
		}
		
		Node lastNode = head;
		while(lastNode.next != null) {
			lastNode = lastNode.next;
		}
		
		lastNode.next = newNode;
	}
	
	public Node get(int k) {
		if(k > -1 && k < size()) {
			Node currentNode = head;
			int i = 0;
			while(i++ != k) {
				currentNode = currentNode.next;
			}
			return currentNode;
		}else {
			System.out.println("Index out of bounds");
			return null;
		}
	}
	
	public int size() {		
		if(head == null) {
			return 0;
		}
		
		int size = 1;
		Node currentNode = head;
		while(currentNode.next != null) {
			currentNode = currentNode.next;
			size++;
		}
		
		return size;
	}
	
	
	public void printAll() {
		if(head == null) {
			System.out.println("There's not elements in the LinkedHugoList");
		}
		
		System.out.println("Elements inside:");
		Node currentNode = head;
		while(currentNode != null) {
			System.out.print(currentNode.data + ", ");
			currentNode = currentNode.next;
		}
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("Creating LinkedHugoList \n");
		LinkedHugoList list = new LinkedHugoList();
		list.append(1);
		list.append(2);
		list.append(3);
		list.push(4);
		int size = list.size();
		System.out.println("Size: " + size);
		System.out.println("Get: " + list.get(1).data);
		list.printAll();
		
	}
}
