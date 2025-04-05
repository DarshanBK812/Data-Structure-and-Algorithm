package Sorting;

import java.util.Arrays;

public class InsertionSort {
	
	public static void main(String[] args) {
		
		     int arr [] = {5,6,7,9,2};
		     int key = 0 ;
		     int j = 0;
		     for(int i = 1 ; i<arr.length-1; i++){
		       key = arr[i];
		       j = i-1;
		       
		       while(j>=0 && arr[j] > key){
		         arr[j+1] = arr[j];
		         j--;
		       }
		       
		       arr[j+1] = key;
		       
		     }
		     
		     System.out.println(Arrays.toString(arr));
		  }
	}


