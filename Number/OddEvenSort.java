package Number;

import java.util.Arrays;

public class OddEvenSort {
	
	public static void main(String[] args) {
		int arr [] = {3, 1, 2, 4, 7, 5, 8, 6};
		
		int even = 0;
		for(int i : arr) {
			if(i % 2 == 0) even++;
		}

		int evenArr [] = new int[even];
		int oddArr [] = new int[arr.length - even];
		
		int evenIndex = 0 , oddIndex = 0;
		
		for(int i : arr) {
			if(i % 2== 0) {
				evenArr[evenIndex++] = i;
			}
			else {
				oddArr[oddIndex++] = i;
			}
		}
		
		Arrays.sort(evenArr);
		System.out.println();
		System.out.print(Arrays.toString(evenArr));
		Arrays.sort(oddArr);
		System.out.println();
		System.out.print(Arrays.toString(oddArr));
		System.out.println();
		
		int i = 0;
		for(int j : evenArr) arr[i++] = j;
		for(int k : oddArr) arr[i++] = k;
		
		System.out.println(Arrays.toString(arr));
		
	}
	
}
