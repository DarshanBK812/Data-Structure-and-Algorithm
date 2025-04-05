package Sorting;

import java.util.Arrays;

public class MergeSort {
	
	public static void main(String[] args) {
		
		int arr [] = {8,5,9,1,6,7};
		
		mergeSort(arr , 0 , arr.length-1);
		
		System.out.println(Arrays.toString(arr));
		
	}

	private static void mergeSort(int[] arr, int l, int r) {
		
		if(l < r) {
			int mid = (l + r)/2;
			mergeSort(arr , l , mid );
			mergeSort(arr,mid+1 , r);
			
			merge(arr , l , mid , r);
				
			
		}
		
	}

	private static void merge(int[] arr, int l, int mid, int r) {
		
		int n1 = mid - l+1;
		int n2 = r-mid;
		
		int larr[] = new int[n1];
		int rarr[] = new int[n2];
		
		for(int x = 0 ; x<n1 ; x++) {
			larr[x] = arr[l+x];
		}
		
		for(int y = 0 ; y <n2 ; y++) {
			rarr[y] = arr[mid+1+y];
		}
		
		int i = 0;
		int j = 0;
		int k = l;
		
		while(i<n1 && j <n2) {
			
			if(larr[i] <= rarr[j]) {
				arr[k] = larr[i];
				i++;
			}
			else {
				arr[k] = rarr[j];
				j++;
			}
			
			k++;
			
		}
		while(i<n1) {
			arr[k] = larr[i];
			i++;
			k++;
		}
		
		while(j < n2) {
			
			arr[k] = rarr[j];
			j++;
			k++;
		}
		
	}

}
