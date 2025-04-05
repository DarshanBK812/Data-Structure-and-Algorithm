package DS2;

public class Queu {
	static int size = 5;
	static int front = -1 , rear = -1 , count = 0;
	static int arr [] = new int[size];
	
	
	public static String enque() {
		if(rear == size) return "full";
		else  return "notfull";
	}
	
	public static String deque() {
		if(rear != size) return "Yes empty";
		else return "Not empty";
	}
	
	public static void push(int data) {
		if(rear == size) {
			System.out.println("Overflow");
		}
		else if(front == rear) {
			rear++;
			arr[rear] = data;
			count++;
		}
		else {
			rear++;
			arr[rear] = data;
			count++;
		}
		
		
	}
	
	public static void pop() {
		
		System.out.println("count : " + count + " , front :" + front + ", rear : " + rear); 
		if(front == -1 && rear == -1) {
			System.out.println("Under Flow");
			return;
		}
		else if(front == rear) {
			arr[rear] = 0;
			rear--;
			front--;
		}
		else {
			front++;
			arr[front] = 0;
			
			rear--;
		}
		count--;
	}
	
	public static void display() {
		for(int i = 0 ; i<count ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("the count : " + count);
		System.out.println("count : " + count + " , front :" + front + ", rear : " + rear); 
		
	}
	public static void main(String[] args) {
		push(5);
		push(4);
		pop();
//		System.out.println(enque());
		System.out.println(deque());
		display();
	}

}
