package Pattersn;

public class Diamond {
	
	public static void main(String[] args) {
		int space = 7 , row = 13 , star = 1;
		
		for(int i = 1 ; i<= row ; i++) {
			int n1 = 0;
			int n2 =1;
			for(int j = 1; j<=space ; j++) {
				System.out.print(" ");
			}
			for(int k = 1 ; k<=star ; k++) {
				if(i%2 != 0) {
					if(k % 2 == 0) {
						System.out.print(n1);
					}
					else System.out.print(n2);
				}
				else if(i%2 == 0) {
					
						if(k % 2 == 0) {
							System.out.print(n1);
						}
						else System.out.print(n2);
				}
				
			
				
				
			}
			
			System.out.println();
			if( i <=row/2) {
				star+=2 ;
				space--;
			}
			else {
				star -= 2;
				space++;
			}
			
			
		}
		
	}

}
