package Arrays;

public class AdvanceBinarySearch {

	
	
	public static void main(String[] args) {
		int arr [] = {40, 50, 60, 10, 20, 10};
		
		for(int i = 0 , j = arr.length-1 ; i<=j ; i++ , j--) {
			
			
		}
	
		System.out.println(advanceBinarySerach(arr ,40 )); 
		
	}
	
	public static String advanceBinarySerach(int arr [] , int key ) {
		
		int left = 0 , right = arr.length-1;
		
		while(left<=right) {
			
			int mid = (left + (right-left)) / 2;
			
			if(arr[mid] == key) {
				return "found";
			}
			
			 if(arr[left] <= arr[mid]) {
				
				if(key >= arr[left] && key < arr[mid]) {
					right = mid - 1;
				}
				else {
					left = mid + 1 ;
				}
			}
			else {
				
				if(key > arr[mid] && key <= arr[right]) {
					left = mid + 1;
				}
				else {
					right = mid - 1;
				}
			}
			
		}
		
		return "Not Fond";
	}
}
