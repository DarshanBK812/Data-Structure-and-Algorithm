package Arrays;

import java.util.Arrays;

public class MoveAllZeroToOnes {
	
	public static void main(String[] args) {
		int arr [] = {1,9,8,4,0,0,2,7,0,6,0};
		
		int index = 0;
			for(int i = 0 ; i<arr.length ; i++) {
				if(arr[i] != 0) {
					arr[index] = arr[i];
					index+=1;
				}
			}
			while(index < arr.length) {
				arr[index] = 0;
				index++;
			}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
