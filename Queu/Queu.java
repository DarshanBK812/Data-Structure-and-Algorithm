package Queu;

public class Queu {
	static int arr[] = new int[4];
	static int front = 0 , rear = -1 , n = arr.length;
	
	public static void enque(int data) {
		//if(rear == n-1) System.out.println("Overflow");
		if((rear+1)% n == front && rear != -1 ) {
			System.out.println("Queu is  over flow");
			return;
		}
		else {
			rear = (rear+1) % n;
			arr[rear] = data;
			System.out.println("Inserted: " + data + ", Rear: " + rear);
		}
	}
	
	public static int deque() {
		if(rear == -1 || front > rear) {
			System.out.println("Queu is under flow");
			return -1;
		}
		
		else {
			int value = arr[front];
			arr[front++] = 0;
			
			
			return value;
		}
	}
	
	public static void display() {
		if(rear == -1) {
			System.out.println("Que is empty");
			return ;
		}
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		enque(1);
		enque(2);
		enque(3);
		enque(4);
		
		deque();
		deque();
		
		
		display();
		
		System.out.println("After the circular queu ");
		enque(1);
		enque(2);
//		enque(5);
		deque();
		
		display();
		
		

		
	}

}
