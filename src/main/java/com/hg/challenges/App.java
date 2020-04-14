package com.hg.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String text = "????????";
        System.out.println(solution(text));
        
    }
    
    public static String solution(String riddle) {
        // write your code in Java SE 8
    	char[] arr = riddle.toCharArray();
    	for(int i = 0; i < arr.length; i++) {
    		
    		if(arr[i] == '?') {
    			//Check bounds
    			boolean inserted = false;
    			while(!inserted) {
    				
    				char prevChar = i != 0 ? arr[i - 1] : '-';
    				char nextChar = i < (arr.length - 1) ? arr[i + 1] : '-';
    				
    				Random r = new Random();
    				char c = (char)(r.nextInt(26) + 'a');
    				
    				if(c != prevChar && c != nextChar) {
    					arr[i] = c;
    					inserted = true;
    				}
    			}
    		}
    	}
    	
    	return String.valueOf(arr);
    }

}
