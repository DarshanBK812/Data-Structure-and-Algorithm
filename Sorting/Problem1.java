package Sorting;

import java.util.Arrays;

public class Problem1 {
	
	
	  public static void main(String args []){
		    int arr [] = {1,2,3,4};
		    
		    int arr2 [] = new int[arr.length];
		    
		    for(int i = 0 ; i<arr.length ; i++) {
		    	
		    	arr2[i] = arr[(i+1)%arr.length ] + arr[(i+2)%arr.length ];
		    	System.out.print(arr2[i] + " ");
		    	
		    }
		      
	 }
	
}


