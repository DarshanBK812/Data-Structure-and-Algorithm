package Pattrens;

public class Pat7 {
	
	public static void main(String[] args) {
		int row = 5 , val =  2*row-1 , space = 0;
		System.out.println(val);
		for(int i = 1 ; i<= row ; i++) {
			
			for(int j = 1 ; j<=space ; j++) {
				System.out.print(" ");
			}
			for(int k = 1 ; k<=val ; k++) {
				if( k == 1  ||  k == val|| i==1 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			space++;
			val -=2;
		
			
		}
	}

}
