package Sorting;

import java.util.Arrays;

public class QuickSort {
	
	
	public static void main(String[] args) {
		
		int arr [] = {5,3,1,4,2};
		
		quickSort(arr , 0 , arr.length-1);
		
		System.out.println(Arrays.toString(arr));
		
	}

	private static void quickSort(int[] arr, int low, int high) {
		System.out.println("low  :" + low + " High " + high);
		if(low<high) {
			int pi = partiation(arr , low , high );
			
			System.out.println("Sort " + pi );
			System.out.println();
			quickSort(arr, low, pi-1);
			quickSort(arr, pi+1, high);
			
		}
		
	}

	private static int partiation(int[] arr, int low, int high) {
		int pivot = arr[high];
//		System.out.println("Pivot value up " + pivot );
		int i = low-1;
		System.out.println("Pivot value up " + pivot + " And I :" + i);
		for(int j = low ; j<high ; j++) {
			
			if(arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;	
			}
		}
		int temp = arr[i+1];
		arr[i+1] = pivot;
		arr[high] = temp;	
		
		
//		System.out.println();
		System.out.println("Pivot value down i+1 :" + (i+1));
//		System.out.print(i+1);
//		System.out.println();
		return i+1;
	}

}
