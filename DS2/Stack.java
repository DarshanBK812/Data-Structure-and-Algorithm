package DS2;

public class Stack {
	
	static int size = 5 ;
	static int top = -1 ;
	static int arr []  = new int[size];
	static int count = 0;
	
	
	public static String isEmpty() {
		System.out.println("Top : " + top);
		if(top != size-1 ) return "Yes";
		else  return "No";
	}
	
	public static String isFull() {
		if(top == size-1) return "Yes";
		else return "No";
	}
	
	public static int peek() {
		return arr[top];
	}
	
	public static void push(int data) {
		if(top == size) {
			System.out.println("Over flow");
			return;
		}
		else {
			top++;
			arr[top] = data;
			count++;
		}
	}
	public static void pop() {
		if(top == -1) {
			System.out.println("Under flow");
			return;
		}
		else {
			int temp = arr[top];
			arr[top] = 0;
			count--;
		}
	}
	
	public static void display() {
		for(int i = 0 ; i<size ; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("count is : " + count);
	}
	public static void main(String[] args) {
		push(2);
		push(3);
//		push(4);
//		push(5);
//		push(6);
//		push(7);
		pop();
		display();
//		System.out.println(isEmpty());
//		System.out.println(isFull());
		
//		System.out.println(peek());
		}
	

}
