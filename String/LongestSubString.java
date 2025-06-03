package String;

import java.util.HashMap;
import java.util.HashSet;

//Longest SubString without repeatating 



public class LongestSubString {
	
	public static int Length(String str) {
		//Inittaially assume length 0 , maxLength = 0
		int length = 0  , maxLength = 0;

		//In order to store the Character and keep track with the unique character
		HashSet<Character> check = new HashSet<>();
		
		for(int i = 0 ; i<str.length(); i++) {
			
			while(check.contains(str.charAt(i))) {
				check.remove(str.charAt(length)); // and remove the repepating character from the set
				length++; //if the character is repeating lets move the length pointer to the next character in the string by increment it
			}
			// add the character for each ittiration 
			check.add(str.charAt(i));
			//calculating a max length of the string without repeating it character
			maxLength = Math.max(maxLength, i -length +1);
		
	
		}
		
		return maxLength;
	}
	
	public static void main(String[] args) {
		String str = "abcabcab";
		System.out.println(Length(str));
	}

}
