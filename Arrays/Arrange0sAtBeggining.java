package Arrays;

import java.util.Arrays;

public class Arrange0sAtBeggining {
	
//	One pointer (j) keeps track of the position where the next zero should be placed.
//
//	Another pointer (i) iterates through the array, swapping zeros forward while maintaining the relative order of non-zero elements.
	
	
	public static void main(String[] args) {
		int arr [] = {1, 0, 0, 2, 1, 3, 0};
		int n = arr.length;
		int j = n-1;
		for(int i = n-1 ; i>= 0 ; i--) {
			if(arr[i] != 0) {
				arr[j--] = arr[i];
			}
		}
		
		while(j>= 0) {
			arr[j--] = 0;
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
