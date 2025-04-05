package Search;

public class L_B_Search {
	
//	 Binary Search Recursive
	public static int BinaryRecursive(int arr [] , int target , int left , int right) {
		
		if(left<=right) {
			
			int mid = (left + right) / 2;
			if(arr[mid] == target) {
				return mid;
			}
			else if(arr[mid] < target) {
				return  BinaryRecursive(arr, target, mid+1, right);
			}
			else {
				return BinaryRecursive(arr, target, left, mid-1);
			}
			
			
			
		}
		return -1;
		
	}
	
	
	  public static void linearSearch(int arr [] , int key){
	    boolean b = false;
	    for(int i = 0 ; i<arr.length-1;i++){
	      if(arr[i] == key) {
	       b = true;
	        break;
	      }
	     
	    }
	    System.out.println(b ? true : false);
	  }
	  
	  public static void binarySearch(int arr [] , int key){
	    int start = 0 , end = arr.length-1;
	    boolean b = false;
	    
	    while(start <= end) {
	    	int mid = (start + end)/2;
	    	
	    	if(arr[mid] == key) {
	    		System.out.println("Sikthu");
	    		
	    		b = true;
	    		return;
	    	}
	    	else if(arr[mid] < key) {
	    		start = mid +1;
	    	}
	    	else {
	    		end = mid-1;
	    	}
	    	
	    }
	    
	    if(b) System.out.println("Sikthu");
	    else System.out.println("Illa");
	  }
	  
	    public static void main(String[] args) {
	      int arr [] = {5,6,8,9,14};
	      int key = 9;
	      linearSearch(arr , key);
	      binarySearch(arr , key);
	      
	      System.out.println(BinaryRecursive(arr, key ,  0 , arr.length-1));
	  }

}
