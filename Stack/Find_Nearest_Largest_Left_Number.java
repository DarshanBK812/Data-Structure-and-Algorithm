
package Stack;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Stack;

public class Find_Nearest_Largest_Left_Number {
   public static void main(String[] args) {
	int arr[] = {1, 3 , 2 , 4};
	
	int temp [] = new int[arr.length];
	
	Stack<Integer> s = new Stack<Integer>();

	for(int i = 0 ; i< arr.length ; i++) {
		
		while(!s.isEmpty() && arr[i] >= s.peek()) {
			s.pop();
		}
		
		temp[i] = s.isEmpty() ? -1 : s.peek();
		
		s.push(arr[i]);
	}
	
	System.out.println(Arrays.toString(temp));
}
}
