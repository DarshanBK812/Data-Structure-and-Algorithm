package StringProblems;

public class RemoveSpecialChar {
	
	public static void main(String[] args) {
		String str = "$%Darsh*an";
		String str2 = "";
		for(int i = 0 ; i<str.length() ; i++) {
			
			if(Character.isLetterOrDigit(str.charAt(i))) {
				str2 += str.charAt(i);
			}
			
		}
		System.out.println(str2);
	}

}
