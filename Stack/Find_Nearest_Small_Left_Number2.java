package Stack;

import java.util.Arrays;
import java.util.Stack;

public class Find_Nearest_Small_Left_Number2 {
	public static void main(String[] args) {
		
		int arr [] = {3 , 7 , 4 , 15 , 9};
		
		Stack<Integer> s = new Stack<Integer>();
		
		int temp [] = new int[arr.length];
		
		for(int i = 0 ; i<arr.length;i++) {
			
			while(!s.isEmpty() && arr[i] <= s.peek()) {
				s.pop();
			}
			
			temp[i] = s.isEmpty() ? -1 : s.peek();
			
			s.push(arr[i]);
		}
		System.out.println(Arrays.toString(temp));
		
	}
}
