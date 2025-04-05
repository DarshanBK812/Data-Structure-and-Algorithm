package Number;

import java.util.HashMap;

public class RomanToInteger {
	
	public static int get(char c) {
		switch(c) {
		
		case 'I' : return 1;
		case 'V' : return 5;
		case 'X' : return 10;
		case 'L' : return 50;
		case 'C' : return 100;
		case 'D' : return 500;
		case 'M' : return 1000 ;
		default : return 0;
		
		}
	}
	public static int get2(String str) {
		HashMap<Character , Integer> map = new HashMap<Character , Integer>();
		map.put('I',1 );
		map.put('V', 5);
		map.put('X', 10);
		map.put('L',50 );
		map.put('C', 100);
		map.put('D',500 );
		map.put('M',1000 );
		int sum = 0;
		int n1 = str.length();
		for(int i = 0 ; i<n1 ; i++) {
			
		int val = map.get(str.charAt(i));
		if((i+1)< n1 && val < map.get(str.charAt(i+1))) sum -= val;
		else sum += val;
			
		}
		return sum;
	}
	
	public static int value(String str) {
		int n1 = str.length();
		int sum = 0;
//		System.out.println("mathod : " + n1);
		for(int i = 0 ; i<n1 ; i++) {
//			System.out.println(str.charAt(i));
			int val = get(str.charAt(i));
			
			if((i+1 )< n1 && val < get(str.charAt(i+1))) sum = sum - val;
			else sum = sum +val;
		}
		
		return sum;
		
	}
	
	
	public static void main(String[] args) {
		String str = "VI";
		System.out.println(value(str));
		System.out.println(get2(str));
		
		
	}

}
