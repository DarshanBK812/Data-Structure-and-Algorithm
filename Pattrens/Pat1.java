package Pattrens;

public class Pat1 {
	
	public static void main(String[] args) {
		int row = 4 , space= 3 , val = 1;
//		int n1 = 1;
//		int n2 = 0;
		for(int i = 1 ; i<=row ; i++) {
			int n1 = i;
			for(int j = 1 ; j<=space ; j++) {
				System.out.print(" " + " ");
			}
			for(int j = 1 ; j<= val/2 +1 ; j++) {
				System.out.print(n1+ " " );
				n1--;
				}
			n1 = 2;
			for(int j = 1 ; j< val/2 +1 ; j++) {
				System.out.print(n1 + " ");
				n1++;
			}
			
			
			System.out.println();
			val+=2;
			space--;
		}
	}

}
