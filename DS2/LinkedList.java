package DS2;

public class LinkedList {
	
	static Node head = null;
	static Node tail = null;
	static int count = 0;
	
	public static void append(Node n) {
		if(head == null && tail == null) {
			head = n;
			tail = n;
		}
		else {
			tail.next = n;
			tail = n;
		}
		count++;
	}
	
	public static void prepend(Node n) {
		if(head == null && tail == null) {
			head = n;
			tail = n;
		}
		else {
			n.next = head;
			head = n;
		}
		count++;
	}
	
	public static void insertAtAny(Node n , int pos) {
		if(pos <= 0 && pos > count) {
			System.out.println("Invalid Option");
			return;
		}
		else if(head == null && tail == null) {
			prepend(n);
		}
		else if(pos == 1) {
			prepend(n);
		}
		else if(pos == count) {
			append(n);
		}
		else {
			Node temp = head;
			for(int i = 1 ; i< pos-1 ; i++) {
				temp = temp.next;
			}
			n.next = temp.next;
			temp.next = n;
			count++;
		}
	}
	
	public static void delet(int pos) {
		if(pos <= 0 && pos > count) {
			System.out.println("Invalid Option");
			return;
		}
		else if(head == null && tail == null) {
			System.out.println("Nothing to delete");
		}
//		else if(pos == 1) {
//			Node temp = head;
//			head = temp.next;
//			temp = null;
//		}
//		else if(pos == count) {
//			Node temp = head;
//			for(int i = 0 ; i<count-1 ; i++) {
//				temp = temp.next;
//			}
//			temp.next = null;
//			tail = temp;
//		}
		else  {
			Node temp = head;
			for(int i = 1 ; i <pos-1 ; i++) {
				temp = temp.next;
			}
			temp.next = temp.next.next;
//			temp.next = null;
		}
		count--;
	}
	
	public static void display() {
		Node temp = head;
		for(int i = 0 ; i<count ; i++) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		
	}
	
	public static void main(String[] args) {
		Node n1 = new Node(10);
		Node n2 = new Node(12);
		Node n3 = new Node(8);
		Node n4 = new Node(9);
		Node n5 = new Node(11);
		Node n6 = new Node(7);
		Node n7 = new Node(88);
		Node n8 = new Node(99);
		
		append(n1);
		append(n2);
		prepend(n3);
		prepend(n6);
		insertAtAny(n4, 3);
		
		prepend(n7);
		insertAtAny(n8, 5);
		
		
//		delet(2);
//		delet(3);
		
		
		
		display();
	}

}
