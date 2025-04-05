package Stack;

public class Stack {
	
	static int arr [] = new int[5];
	
	static int top = -1 ;
	
	static int n = 5;
	public static void push(int d) {

		if(top == n-1 ) System.out.println("Over Flow");
		else {
			arr[++top] = d;
		}
		
	}
	public static int pop() {
		
		
		if(top>= 0) {
			arr[top] = 0;
			int popValue = arr[top--];
			
			return popValue ;
		}
		else {
			System.out.println("Stack is under flow");
			return -1;
		}
		
			
		
		
		
	}
	
	public static int peek() {
		if(top == -1) {
			System.out.println("Under flow");
			return -1;
		}
		return arr[top];
		
		
	}
	
	public static boolean isFull() {
		if(top == n-1) return true;
		else return false;
	}
	
	public static void display() {
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}
	
	public static void main(String[] args) {
		push(1);
		push(2);
		push(3);
		push(4);
//		push(5);
		System.out.println("Pop : " + pop());

		System.out.println();
		display();

	}
	
}
