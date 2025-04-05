package TUF;

public class RverseString {
//	Using recursion method
	public static String reverse4(String str) {
		if(str.isEmpty()) return str;
		System.out.println(str.substring(1));
		System.out.println(str.charAt(0));
		return reverse4(str.substring(1)) + str.charAt(0);
	}
	public static void reverse3(String str) {
		char ch [] = str.toCharArray();
		
		for(int i = 0 , j = str.length()-1 ; i<j ; i++ , j-- ) {
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
		}
		System.out.println(new String(ch));
	}
	public static void reverse2(String str) {
		String str2 = "";
		char ch [] = str.toCharArray();
		for(int  j = str.length()-1 ; j>=0 ;  j--) {
			str2 = str2 + ch[j];
		}
		System.out.println(str2);
	}
	
	public static void reverse1(String str) {
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse()
				); 
		
	}
	public static void main(String[] args) {
		reverse1("darshan");
		reverse2("darshan");
		reverse3("darshan");
//		Using recursion Method
		System.out.println(reverse4("darshan"));
		
	}

}
