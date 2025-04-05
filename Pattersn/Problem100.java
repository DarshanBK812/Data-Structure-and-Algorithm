package Pattersn;

public class Problem100 {
	public static void main(String[] args) {
		int row = 10 , col = 10;
		char ch = 'A';
		for(int i = 1 ; i<=10 ; i++) {
			
			for(int j = 1 ; j<=10 ; j++) {
				
				if(i == 1 || i == row || i == j || (i+j) == 9) {
					System.out.print(ch );
				}
				else {
					System.out.print(" " );
				}
				
			}
			System.out.println();
			ch++;
			
		}
		
	}

}
