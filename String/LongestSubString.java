package String;

import java.util.HashMap;
import java.util.HashSet;

//Longest SubString without repeatating 



public class LongestSubString {
	
	public static int Length(String str) {
		
		int length = 0  , maxLength = 0;
		HashSet<Character> check = new HashSet<>();
		
		for(int i = 0 ; i<str.length(); i++) {
			while(check.contains(str.charAt(i))) {
				check.remove(str.charAt(length));
				length++;
			}
			
			check.add(str.charAt(i));
			maxLength = Math.max(maxLength, i -length +1);
		
	
		}
		
		return maxLength;
	}
	
	public static void main(String[] args) {
		String str = "abcabcab";
		System.out.println(Length(str));
	}

}
