package Sorting;

import java.util.Arrays;

public class SortedEvenOdd {
	public static void main(String[] args) {
		int arr [] = {3, 1, 2, 4, 7, 5, 8, 6};
		
		int evenCount = 0;
		for(int i : arr) {
			if(i % 2 == 0) {
				evenCount++;
			}
		}
		int n = arr.length;
		int earr [] = new int[evenCount];
		int oarr [] = new int[n - evenCount];
		
		int eIndex = 0;
		int oIndex = 0;
		for(int i: arr) {
			if(i % 2 == 0) {
				earr[eIndex++] = i;
			}
			else {
				oarr[oIndex++] = i;
			}
		}
		
		Arrays.sort(earr);
		
		Arrays.sort(oarr);
		
		int k = 0;
		
		for(int j : oarr) arr[k++] = j;
		
		for(int i : earr) arr[k++] = i;
	
		System.out.println(Arrays.toString(arr));
		
	}

}
