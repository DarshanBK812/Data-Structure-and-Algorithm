package DsaBasics;

public class Search {
	public static void main(String[] args) {
//		we can perform a read operation
		int arr [] = {1,2,3,4,5,7};
		int key = 8;
		for(int i = 0 ; i<arr.length;i++) {
			if(arr[i] == key) {
				System.out.println("found");
				break;
			}
		}
		
		
		int data = 6;
		
		for(int i = 2 ; i<=10 ; i+=2) {
			System.out.print(i);
		}
	}
}
