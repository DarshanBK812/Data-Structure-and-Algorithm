package Arrays;

public class NonReapeating {
	
	public static void main(String[] args) {
		int arr [] = {1 , 1 , 3 , 1 , 2 , 4 , 5};
		
		for(int i = 0 ; i<arr.length; i++) {
			int count = 0;
			
			for(int j = 0 ; j<arr.length ; j++) {
//				System.out.println(arr[i] + " " + arr[j]);
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			if(count == 1) {
				System.out.println(arr[i]);
				break;
			}
		}
	}

}
