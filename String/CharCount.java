package String;

import java.security.KeyStore.Entry;
import java.util.Arrays;
import java.util.HashMap;
//import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class CharCount {
	
	public static void countSpace(String str) {
		
		char ch [] = str.toCharArray();
		
		
		Map<Character , Integer> map = new HashMap<Character, Integer>();
		
		for(char c : ch) {
	if(String.valueOf(c).isBlank()) {
				if(map.containsKey(c)) {
					map.put(c, map.get(c)+1);
				}
				else{
					map.put(c , 1);
				}
			}	
		}
		System.out.println(map);
		
	}
	
	public static void getCharCount(String str) {
		char ch [] = str.toCharArray();
		
		
		Map<Character , Integer> charMap = new HashMap<Character, Integer>();
		
		
		
		for(char c : ch) {
			c = Character.toLowerCase(c);
		if(!String.valueOf(c).isBlank()) {
			if(charMap.containsKey(c)) {
				
				charMap.put(c,charMap.get(c)+1);
			}
			else{
				
				charMap.put(c, 1);
			}
		}
		
		}
		
		System.out.println(charMap);
		System.out.println();
		
		Set<Map.Entry <Character , Integer>> entry = charMap.entrySet();
		
		for(Map.Entry <Character , Integer> s : entry) {
			if(s.getValue() == 2){
				System.out.println(s.getKey());
			}
		}
		
	}
	public static void main(String[] args) {
		getCharCount("Darshan b k d");
//		countSpace("jqhvedycv kqbedbw nkbwefj");
//		StringBuilder s = new StringBuilder();
		String str = "Darshan";
//		s.append(str);
//		System.out.println(s.reverse());
//		
//		String s = "";
//		
//		char ch [] = str.toCharArray();
//		
//		for(int i = str.length()-1 ; i>=0; i--) {
//			s += ch[i];
//			}
//		
//		
//		System.out.println(s);
	}

}
