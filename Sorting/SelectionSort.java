package Sorting;

import java.util.Arrays;

public class SelectionSort {
	
	public static int [] SelectionSort(int arr []) {
		int minIndex = 0;
		int temp = 0;
		for(int i = 0 ; i<arr.length; i++) {
			minIndex = i;
			for(int j = i ; j<arr.length; j++) {
				if(arr[minIndex] > arr[j]) {
					minIndex = j; 
				}
			}
			
			 temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}	
			
		return arr;
	}
	
	public static void main(String[] args) {
		int arr [] = {6 , 5 , 2 , 8 , 9 , 4};
		
		System.out.println(Arrays.toString(SelectionSort(arr)));
	}

}
