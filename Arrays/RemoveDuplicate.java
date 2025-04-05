package Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicate {
	
	public static int[] remove2(int [] arr) { 
		int n = arr.length;
		
		
		int uniqCount = n;
		for(int i = 0 ; i<n ; i++) {
			for(int j = 0 ; j<i ; j++) {
				if(arr[i] == arr[j]) {
					uniqCount--;
				}
			}
			
		}
		
		int temp [] = new int[uniqCount];
		int index = 0;
		
		for(int i = 0 ; i<n ; i++) {
			
			boolean b = false;
			
			for(int j = 0 ; j<i ; j++) {
				
				if(arr[i] == arr[j]) {
					b = true;
					break;
				}
			}
			
			if(!b) {
				
				temp[index++] = arr[i];
			}
		}
		
		return temp;
	}
	
	
	public static int[] remove(int [] arr) {
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i : arr) {
			set.add(i);
		}
		
		int arr2 [] = new int[set.size()];
		int index = 0;
		for(int j : set) {
			arr2[index++] = j;
		}
		return arr2;
	}
	
	public static void main(String[] args) {
		int arr [] = {1, 2, 3, 4, 2, 5, 6, 3, 7};
		int [] uniquArr = remove2(arr);
		System.out.println(Arrays.toString(uniquArr));
	}

}
