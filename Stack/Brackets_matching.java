package Stack;

import java.util.Stack;

public class Brackets_matching {
	
	public static boolean check(String str) {
		
		Stack<Character> s = new Stack<Character>();
		for(char ch : str.toCharArray()) {
			
			if(ch == '(' || ch == '{' || ch == '[') {
				s.push(ch);
			}
			else if(ch == ')' || ch == '}' || ch == ']') {
				if(s.isEmpty()) {
					return false;
				}
				
				char top = s.pop();
				if(!match(top , ch )) {
					return false;
				}
			}
			
		}
		
		return s.isEmpty();
	}
	
	public static boolean match(char p1, char p2 ) {
		return((p1 == '(' && p2 == ')') || (p1 == '{' && p2 == '}') || (p1 == '[' && p2 == ']'));
	}
	
	public static void main(String[] args) {
		String str = "[{()}]";
		
		if(check(str)) System.out.println("Matching");
		else System.out.println("not ");
	}
}
			
		
		
		
		
	


