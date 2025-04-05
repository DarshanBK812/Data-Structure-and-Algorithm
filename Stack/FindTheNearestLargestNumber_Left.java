package Stack;

import java.util.Arrays;
import java.util.Stack;

public class FindTheNearestLargestNumber_Left {
	
	public static int[] arrange(int arr []) {
		int sort [] = new int[arr.length];
		Stack<Integer> s = new Stack<Integer>();
		for(int i = 0 ; i<arr.length ; i++) {
			while(!s.isEmpty() && arr[i] >= s.peek()) {
				s.pop();
			}
			
			sort[i] = s.isEmpty() ? -1 : s.peek();
			
			s.push(arr[i]);
		}
		
		return sort;
	}
	
	public static void main(String[] args) {
		int arr [] = { 12, 4 , 5 , 1 , 2 , 4 , 6};
		System.out.println(Arrays.toString(arrange(arr)));
		
	}

}
