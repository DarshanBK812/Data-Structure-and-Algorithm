package Arrays;

public class Container_With_Most_Water {
	
	public static int maxWidth(int height []) {
		int left = 0 , right = height.length-1;
		int maxArea = 0;
		while(left < right) {
			int area = Math.min(height[left], height[right]) * (right - left);
			maxArea = Math.max(area, maxArea);
			if(height[left] < height[right]) left++;
			else right--;
		}
		return maxArea;
	}
	
	public static int minWidth(int height []) {
		int left = 0 , right = height.length-1;
		int minArea = Integer.MAX_VALUE;
		while(left < right) {
			int area = Math.min(height[left], height[right]) * (right - left);
			minArea= Math.min(minArea, area);
			
			if(height[left] < height[right]) left++;
			else right--;
		}
		return minArea; 	
	}
	
	public static void main(String[] args) {
		
		int arr [] = {1,8,6,2,5,4,8,3,7};
		System.out.println(maxWidth(arr));
		System.out.println(minWidth(arr));
		
	}

}
