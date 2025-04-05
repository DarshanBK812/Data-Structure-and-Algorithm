package Arrays;

import java.util.Arrays;

public class ReverseSentence {
	
	public static void main(String[] args) {
		String str = "I will get a good Job";
		String s [] = str.split(" ");
		
		for(int i = 0 ,j = s.length-1 ; i<j ; i++ , j--) {
			String temp = s[i];
			s[i] = s[j];
			s[j] = temp;
		}
		String s2 = "";
		
		System.out.println(Arrays.toString(s));
		for(String s1 : s) {
			s2+=s1 +" ";
		}
		System.out.println(s2);
		String loNg = "";
		for(String s3 : s) {
			if(s3.length() >= loNg.length()) {
				loNg = s3;
			}
		}
		System.out.println(loNg);
	}
	

}
