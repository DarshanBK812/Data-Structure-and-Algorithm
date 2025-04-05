package Arrays;

public class Arrange0sAtTheEnd {
	
	public static void main(String[] args) {
		int arr [] = {1, 0, 0, 2, 1, 3, 0};
		int j = 0;
		for(int i = 1 ; i< arr.length ; i++ ) {
			if(arr[i] != 0) {
				arr[j++] = arr[i];
			}
		}
		while(j<arr.length) {
			arr[j++] = 0;
		}
	}

}
