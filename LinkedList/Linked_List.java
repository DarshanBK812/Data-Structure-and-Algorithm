package LinkedList;

public class Linked_List {
	
	static Node head = null , tail = null ;
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
	
	public static void mid(Node n , int pos) {
		System.out.println("Count: " + count);
		if(pos <= 0 && pos > count) {
			System.out.println("Invalid");
		}
		
		if(pos == 1) {
			prepend(n);
		}
		if(pos == count+1) {
			append(n);
		}
		else {
			
			Node temp = head;
			for(int i = 1 ; i<pos-1; i++) {
				temp = temp.next;
			}
			
			n.next = temp.next;
			temp.next = n;
			count++;
		}
		
	}
	
	public static void delete(int pos) {
		Node temp = head;
		if(head == null && tail == null) {
			System.out.println("Nothing to delete");
		}
		
		if(pos <= 0 && pos > count) {
			System.out.println("Invalid option");
		}
		
		if(pos == 1) {
			head = head.next;
			temp= null;
		}
		else {
			for(int i = 1 ; i<pos-1 ; i++) {
				temp = temp.next;
			}
			
			temp.next = temp.next.next;
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
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		
		append(n2);
		prepend(n1);
		append(n4);
		mid(n3, 3);
		
		mid(n5 , 5);
		
		delete(5);
		display();
	}

}
