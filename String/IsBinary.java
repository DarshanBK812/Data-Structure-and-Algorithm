package String;

public class IsBinary {
	
	public static void isBinary(int num) {
		
		int copy = num;
		boolean isBin = true;
		
		while(copy != 0) {
			int r =  copy % 10 ;
			if(r > 1) {	
				isBin = false;
				break;
			}
			else {
				copy /= 10;
			}
		}
		
		idBin
	}
	
	public static void main(String[] args) {
		isBinary(123); 
		
		
	
	}

}
