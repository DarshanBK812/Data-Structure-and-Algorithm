package TUF;

public class GCD {
	public static void main(String[] args) {
		int n1 = 36 , n2 = 12 ;
		int gcd = 1;
		 int min = 0  , max = 0;
		
		if(n1 > n2) {
			max = n1/2;
			min = n2;
		}
		else {
			max = n2/2;
			min = n1 ;
			
		}
		
		
		
		
		for(int i = min ; i<=max ; i++) {
			
			if( n1 % i ==  n2 % i ) {
				gcd = i;
				break;
			}
			
		}
		System.out.println(gcd);
	}

}
