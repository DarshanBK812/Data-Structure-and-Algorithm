package Pattrens;

public class Pat3 {
	public static void main(String[] args) {
		int row = 6 ,  space = 4, val = 1;
		for(int i = 1 ; i<=row ; i++) {
			
			for(int j = 1 ; j< 7-i ; j++) {
				System.out.print(" ");
			}
			for(int k = 1 ; k<= i ; k++) {
				
				System.out.print(i+ " ");
			}
			System.out.println();
//			if(i <= row/2) {
//				val+=2;
//				space--;
//			}
//			else {
//				val-=2;
//				space++;
//			}
		}
	}

}
