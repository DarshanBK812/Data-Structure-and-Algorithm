package Stack;

import java.util.Arrays;
import java.util.Stack;

public class TheStockSpanProblem {
	
	//O(n^2)
	public static int[] stackSpan1(int [] arr) {
		
		int n = arr.length;
		int temp [] = new int[n];
		for(int i = 0 ; i<n ; i++) {
			int count = 1;
			for(int j = i-1 ; j >= 0 && arr[j] <= arr[i] ; j-- ) {
				count++;
			}
			
			temp[i] = count;
		}
		return temp;
		
	}
	
//	O(n) timecomplexity
	public static int[] stackSpan2(int [] arr) {
		int n = arr.length;
		int temp [] = new int[n];
		Stack<Integer> s = new Stack<Integer>();
		for(int i = 0 ; i<n ; i++) {
			while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {
				s.pop();
			}
				
			temp[i] = s.isEmpty() ? i+1 : i - s.peek();	
				
			s.push(i);
		}
		return temp;
	}
	
	public static void main(String[] args) {
		int arr [] = {100, 80, 60, 70, 60, 75, 85};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(stackSpan2(arr)));
	}

}
