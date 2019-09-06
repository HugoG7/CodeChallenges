package com.hg.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DynamicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> queries = new ArrayList<>();
		queries.add(Arrays.asList(new Integer[] {1,0,5}));
		queries.add(Arrays.asList(new Integer[] {1,1,7}));
		queries.add(Arrays.asList(new Integer[] {1,0,3}));
		queries.add(Arrays.asList(new Integer[] {2,1,0}));
		queries.add(Arrays.asList(new Integer[] {2,1,1}));
		
		List<Integer> result = dynamicArray(2, queries);
		System.out.println("RESULT => " + Arrays.toString(result.toArray()));
	}

	public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
		List<Integer> answerList = new ArrayList<>();

		//List<List<Integer>> seqList = new ArrayList<>();		
		//seqList.stream().limit(10).map(x -> new ArrayList<Integer>()).collect(Collectors.toList());
		
		List<List<Integer>> seqList = IntStream.range(0, n)
				.mapToObj(ArrayList<Integer>::new)
				.collect(Collectors.toList());

		int lastAnswer = 0;
		for(List<Integer> seq : queries){
			//GET QUERY
			int query = seq.get(0);
			int x = seq.get(1);
			int y = seq.get(2);
			
			int index = (x ^ lastAnswer) % n;
			if(query == 1) {
				//QUERY 1
				seqList.get(index).add(y);
			}else {
				//QUERY 2
				int size = seqList.get(index).size();
				lastAnswer = seqList.get(index).get(y % size);
				answerList.add(lastAnswer);
			}
		}

		return answerList;
	}
}
