package Sorting;

import java.util.Arrays;

public class BubbleSort {
	
	public static int [] bubbleSort(int arr []) {
		int temp = 0;
		for(int i = 0 ; i<arr.length; i++) {
			
			for(int j = 0 ; j<arr.length-1-i; j++) {
				
				if(arr[j] > arr[j+1])	{		
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]  = temp;
				}
			
			}
		}	
			
		return arr;
	}
	
	public static void main(String[] args) {
		int arr [] = {6 , 5 , 2 , 8 , 9 , 4};
		
		System.out.println(Arrays.toString(bubbleSort(arr)));
	}

}
