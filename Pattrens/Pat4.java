package Pattrens;

public class Pat4 {
	
	public static void main(String[] args) {
		int row = 5 , space = row-1 , val = 1;
		for(int i = 1 ; i<= row ; i++) {
			for(int j = 1 ; j<=space ; j++) {
				System.out.print(" ");
			}
			for(int k = 1 ; k<=val ; k++) {
				
				if(k == 1 || k==val || i == row){
					System.out.print("*" );
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			val+=2;
			space--;
		}
	}

}
