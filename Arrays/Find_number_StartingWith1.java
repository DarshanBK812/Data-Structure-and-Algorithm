package Arrays;

import java.util.ArrayList;
import java.util.List;

//167/10 = 16 / 10 = 1


public class Find_number_StartingWith1 {
	
	public static void check(int [] arr) {
		
		List<Integer> l = new ArrayList<Integer>();
		
		for(int i : arr) {
			int n = i;
			while(n > 10) {
				n /= 10;
				
			}
			if(n == 1) {
				l.add(i);	
					
				}
		}
		System.out.println(l);
		
	}
	
	public static void main(String[] args) {
		int arr [] = {1 , 23 , 123 , 45 , 167 , 91 , 111};
		
		check(arr);
		
		
	}

}
