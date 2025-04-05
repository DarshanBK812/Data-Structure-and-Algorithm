package String;

public class isValidNumber {
	
	public static boolean isNumber(String num) {
		try{
			Float.parseFloat(num);
			System.out.println("Valid num: " + num);
			
		}
		catch(Throwable t) {
			System.out.println("Not valid num: " + num );
			return false;
		}
		return true;
		
	}
	
	public static boolean isValidPhNumber(String num) {
		if(num.length() == 10 && isNumber(num)) {
			System.out.println("Valid phno: " + num);
			return true;
		}
		System.out.println("Not Valid phno: " + num);

		return false;
	}
	public static void main(String[] args) {
//		isNumber("9663822023");
		isValidPhNumber("9663822023");
		
		
	}
}
