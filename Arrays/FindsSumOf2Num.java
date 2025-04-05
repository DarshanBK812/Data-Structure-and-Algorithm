package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

//Find the sum of 2 numbers

public class FindsSumOf2Num {
	
	public static int[] findIndex2(int arr [] , int target ) {
		ArrayList<Integer> l = new ArrayList<>();
		for(int i = 0 ; i<arr.length ; i++) {
			int a = target-arr[i];
			if(l.contains(a)) {
				return new int [] {l.get(i), arr[i]};
			}
			else l.add(arr[i]);
		}
		return null;
	}

//	public static void findIndex3(int arr [] , int target ) {
//		int l = 0 , r = arr.length-1;
//		System.out.println("start");
//		while(l < r) {
//			int a = target - arr[l];
//			int b = target - arr[r];
//			if(arr[l] == a || arr[r] == b ) {
//				System.out.println("Not found");
//				return;
//			}
//			l++;
//			r--;
//		}
//		System.out.println("Not found");
//	}
	
	public static int[] findIndex(int arr [] , int target ) {
		
		Map<Integer,Integer> m = new HashMap<Integer,Integer>();
		
		for(int i = 0 ; i<arr.length ; i++) {
			
			int match = target - arr[i];
			if(m.containsKey(match)) {
				return new int[] {m.get(match), i};
			}
			
			m.put(arr[i], i);
		}
		return null;
	}
	
	public static void main(String[] args) {
		int arr [] = {1,3,5 , 4 };
		int target = 9;
		int result [] =findIndex2(arr, target);
		if(result.length > 0) {
			System.out.println(Arrays.toString(result));
		}
		else {
			System.out.println("not found");
		}
	}
}