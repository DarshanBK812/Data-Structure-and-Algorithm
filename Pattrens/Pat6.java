package Pattrens;

public class Pat6 {
	
	public static void main(String[] args) {
		int row = 7 , col = 7 ;
		for(int i = 1 ; i<= row ; i++) {
			for(int j = 1 ; j<=col ; j++) {
				if(i==j || (i+j) == 8 || ((i == (row/2)+1 && j%2 == 0)) || ((i%2 != 0) && j==1) || (i%2 != 0) && j == col)  {
					System.out.print("*" + " ");
				}
				else {
					System.out.print(" " + " ");
				}
			}
			System.out.println();
		}
	}

}
