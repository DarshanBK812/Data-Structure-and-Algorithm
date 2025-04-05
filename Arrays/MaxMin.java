package Arrays;

public class MaxMin {
	public static void main(String[] args) {
		int arr [] = {20 , 20 , 5 , 30};
		int max = arr[0];
		int min = arr[0];
		for(int i = 1 ; i<arr.length ; i++) {
			if(arr[i]> max) {
				max = arr[i];
			}else {
				min = arr[i];
			}
		}
		System.out.println("Max :" + max + " Min " + min);
	}
}
