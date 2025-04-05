package Arrays;

import java.util.Arrays;

public class RightRotate {
	
	public static void rotate(int arr [] , int times) {
		
		for(int i = 0 ; i<times ; i++) {
			
			int temp = arr[arr.length-1] ;
			for(int j = arr.length-1 ; j>=1 ; j--) {
			arr[j] = arr[j-1];
			}
			arr[0]= temp;
		}
		System.out.println(Arrays.toString(arr));

	}
	
	public static void main(String[] args) {
		int []arr= {30,20,10,50,40,125,130};
		rotate(arr , 2);
	}

}
