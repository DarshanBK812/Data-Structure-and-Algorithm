package Stack;

import java.util.Arrays;
import java.util.Stack;

public class FindTheNearestLargestNumber_Right {
	
	public static int[] arrange(int arr []) {
		int sort [] = new int[arr.length];
		Stack<Integer> s = new Stack<Integer>();
		for(int i = arr.length-1 ; i>=0 ; i--) {
			while(!s.isEmpty() && arr[i] >= s.peek()) {
				s.pop();
			}
			
			sort[i] = s.empty() ? -1 : s.peek();
			
			s.push(arr[i]);
		}
		
		
		return sort;
	}
	
	public static void main(String[] args) {
		int arr [] = {4 , 12 , 5 , 1 , 2 , 4 , 6};
		System.out.println(Arrays.toString(arrange(arr)));
		
	}
}
