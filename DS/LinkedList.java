package DS;

public class LinkedList {
	static Node head = null;
	static Node tail = null;
	static int count = 0;
	public static void append(Node n) {
		if(head == null && tail == null) {
			head = n ;
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
			head = n ;
			tail = n;
		}
		else {
			n.next = head;
			head = n;
		}
		count++;
	}
	public static void mid(Node n , int pos) {
		if(pos <=0 || pos > count) {
			System.out.println("Invalid option");
			return;
		}
	if(pos == 1) {
		prepend(n);
	}
	else if(pos == count+1) {
		System.out.println(count);
		System.out.println(pos);
		append(n);
	}
	else {
		Node temp = head;
		for(int i =1;i<pos-1;i++) {
			temp = temp.next;
		}
		n.next = temp.next;
		temp.next = n;
		count++;	
	}
	}
	public static void display() {
		Node temp = head;
		for(int i=1;i<count+1;i++) {
			System.out.print(temp.data + " ,");
			temp = temp.next;
		}
		System.out.println();
	}
	public static void del(int pos) {
		System.out.println(pos);
		if(pos == 0 && pos == count+1) {
			System.out.println("Invalid option");
			return;
		}
		if(head == null && tail == null ) {
			System.out.println("Nothing to delete");
			return;
		}
		if(pos == 1) {
			Node temp = head;
			head = temp.next;
			temp = null;
		}
		else if(pos == count) {
			Node temp = head;

			for(int i=1;i<count-1;i++) {
				temp = temp.next;
			}
			temp.next = null;
			tail = temp;
			
		}
		else {
			Node temp = head;
			for(int i =1;i<pos-1;i++) {
				temp = temp.next;
			}
			temp.next = temp.next.next;
		}
		count--;
	}
	public static void main(String args []) {
		
		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(15);
		prepend(n1);
		append(n2);
		mid(n3 , 2);
		del(2);
		display();
	}
	
}
