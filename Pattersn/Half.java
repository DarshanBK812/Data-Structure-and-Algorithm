package Pattersn;

public class Half {
	
	public static void main(String[] args) {
		int row = 5 ; int val = 1 , space = 5;
		
		for(int i = 1 ; i<=row ; i++) {
			char ch = 'A';
			for(int j = 1 ; j<=space ; j++) {
				System.out.print(" ");
			}
			for(int k =1 ; k<=val ; k++) {
				
				System.out.print(ch);
			}
			
			System.out.println();
			val++;
			space--;
		}
	}

}
