package com.hg.challenges.structures;

import java.util.LinkedList;

public class DSLinkedList {

	public static void main(String[] args){
		pollVsPop();
	}
	
	static void ex1(){
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		list.addFirst(5);
		list.addLast(50);
		list.push(100);
		list.poll();
		
		System.out.println("LinkedList size: " + list.size());
		System.out.println("LinkedList element [head]: " + list.get(0));
		System.out.println("LinkedList element [1]: " + list.get(1));
		System.out.println("LinkedList element [last]: " + list.get(list.size() - 1));
	}
	
	static void pollVsPop(){
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println("LinkedList size: " + list.size());
		System.out.println("LinkedList element [poll]: " + list.poll());
		System.out.println("LinkedList element [pop]: " + list.removeLast());
	}
}
