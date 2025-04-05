package Recursion;

public class Demo {
	
	public static void main(String[] args) {
		int i = 5;
	System.out.println(f1(5));	
	}

	private static int f1(int i) {
		
		
		if(i==0) return 1;
		
			
			return i*f1(i-1);
			
		
		
		
		
	}

	
}
