package Arrays;

public class MissingNumber {
	
	public static void main(String[] args) {
		int arr [] = {1 ,2 ,4 ,5 };
		int end = 5;
		int sum = 0;
		int s = (end*(end+1))/2;
		for(int i : arr) {
			sum += i;
		}
		int mis = s - sum;
		System.out.println(mis);
		
	}

}
