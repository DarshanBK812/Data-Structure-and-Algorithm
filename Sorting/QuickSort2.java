package Sorting;

import java.util.Arrays;

public class QuickSort2 {
	
	public static void quickSort(int arr [] , int low , int high) {
		if(low < high) {
			int pivot = partician(arr , low , high);
			
			quickSort(arr, low, pivot-1);
			quickSort(arr, pivot+1, high);
		}
		
	}
	
	public static int partician(int arr [] , int low , int high) {
		
		int pivot = arr[high];
		int i = low-1;
		
		for(int j = low ; j<high ; j++) {
			if(arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		
			
		}
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		
		return i+1;
		
	}

	
	public static void main(String[] args) {
		int arr [] = {4,2,1,3,7};
		quickSort(arr , 0 , arr.length-1);
		System.out.println(Arrays.toString(arr));
		
		
	}
}
