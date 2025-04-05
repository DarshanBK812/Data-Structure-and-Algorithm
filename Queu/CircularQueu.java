package Queu;

public class CircularQueu {
	
	public static int rear = -1 , front = 0  , size = 0;
	static int arr [] = new int[4];
	
	public static void enque(int data) {
		System.out.println("rear :" + rear + " front : " + front);
		if(!isFull()) {
			rear = (rear+1)%4;
			arr[rear] = data;
			size++;
		}
		else {
			System.out.println("overflow");
		}
	}
	
	public static int deque() {
		if(!isEmpty()) {
			int value = arr[front];
			arr[front] = 0;
			front = (front+1)%4;
			return value;
		}
		else System.out.println("Under flow");
		return -1;
	}
	
	public static boolean isFull() {
		 return size == 4;
	}
	
	public static boolean isEmpty() {
		return rear == -1;
	}
	
	public static void display() {
		for(int i : arr) {
			System.out.print(i+ " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		enque(1);
//		enque(2);
//		enque(3);
//		enque(4);

//		deque();
//		enque(5);
//		deque();
//		deque();
//		deque();
//		deque();
		
		
		
		display();
		
	}

}
