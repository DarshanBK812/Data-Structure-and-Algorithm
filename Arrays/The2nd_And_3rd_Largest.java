package Arrays;

public class The2nd_And_3rd_Largest {
	
	public static void find(int arr []) {
		int m1 = arr[0];
		int m2 = arr[0];
		int m3 = arr[0];
		for(int i : arr) {
			if(i > m1) {
				m3 = m2;
				m2 = m1;
				m1 = i;
						
			}else if(i > m2 && i < m1) {
				m3 = m2 ;
				m2 = i;
			}
			else if(i > m3 && i < m2) {
				m3 = i;
			}
		}
		System.out.println(m1);
		System.out.println(m2);

		System.out.println(m3);

	}
	
	public static void main(String[] args) {
		 int arr [] = {2 , 7 , 5 , 3, 4 , 1 , 8};
		 find(arr);
	}

}
