package Number;

public class PerfectNumber {
	
	public static void main(String[] args) {
		int num = 28;
		int sum = 0;
		for(int i = 1 ; i<=num/2; i++) {
			
			if(num % i == 0) {
				System.out.println(i);
				sum = sum + i; 
			}
			
		}
		if(sum == num)
		System.out.println("yes");
		else System.out.println("not ");
	}

}
