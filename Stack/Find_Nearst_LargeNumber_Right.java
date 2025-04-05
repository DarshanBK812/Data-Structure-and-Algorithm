package Stack;

import java.util.Arrays;
import java.util.Stack;

public class Find_Nearst_LargeNumber_Right {
	
	
	
	public static void main(String[] args) {
		
		 int arr [] = {1 , 3 , 2 , 4};
			
			int temp [] = new int[arr.length];
			
			Stack<Integer> s = new Stack<Integer>();
			
			for(int i = arr.length-1 ; i>= 0 ; i-- ) {
				
				while(!s.empty() && arr[i] >= s.peek()) {
					s.pop();
				}
				temp[i] = s.isEmpty() ? -1 : s.peek();
 				
				s.push(arr[i]);
			}
			
			
			System.out.println(Arrays.toString(temp));
			
			
		}
		
		
	}
	
	
