package Pattrens;

public class Pat2 {
	public static void main(String[] args) {
		int row = 5 ,  space = 0, val = 4;
		for(int i = 1 ; i<=row ; i++) {
			
			for(int j = 1 ; j<=space ; j++) {
				System.out.print(" " );
			}
			for(int k = 1 ; k<= val ; k++) {
				System.out.print("*" + " ");
			}
			System.out.println();
			space++;
		}
	}

}
