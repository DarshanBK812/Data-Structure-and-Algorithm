package DS2;

public class DoubleLinkedList {
	
	static Node2 head = null;
	static Node2 tail = null;
	static int count = 0;
	
	public static void append(Node2 n) {
		if(head == null && tail == null) {
			head = n;
			tail = n;
		}
		else {
			tail.next = n;
			n.prev = tail;
			tail = n;
			
		}
		count++;
	}
	
	public static void prepend(Node2 n) {
		if(head == null && tail == null) {
			head = n;
			tail = n;
		}
		else {
			n.next = head;
			head = n.prev;
			head = n;
			
		}
		count++;
	}
	
	public static void delete(int pos) {
		if(pos <= 0 && pos > count ) {
			System.out.println("Invalid Option");
			return;
		}
		if(head == null && tail == null) {
			System.out.println("UnderFlow");
		}
		if(pos == 1) {
			Node2 temp = head;
			head = temp.next;
			if(head!=null) {
				head.prev = null;
			}else {
				tail = null;
			}
			temp = null;
			
			
		}
		else if(pos == count) {
			Node2 temp = tail;
		
			tail = temp.prev;
			if(tail!=null) {
				tail.next = null;
			}
			else {
				head = null;
			}
			temp = null;
			
			
		}
		else {
			Node2 temp = head;
			for(int i = 1 ; i<pos ; i++) {
				temp = temp.next;
			}
			temp.prev.next = temp.next;
			temp.next.prev = temp.prev;
			temp = null;
		}
		count--;
		
	}
	
	public static void mid(Node2 n ,int pos) {
		
		if(pos<=0) {
			System.out.println("Invalid Option");
			return;
		}
		if(pos == count+1) {
			append(n);
		}
		else if(pos == 1) {
			prepend(n);
		}
		else {
			Node2 temp = head;
			for(int i = 1 ; i<pos;i++) {
				temp = temp.next;
			}
			temp.next.prev = n;
			n.next = temp.next;
			temp.next = n;
			n.prev = temp;
		}
		
	}
	
	public static void display() {
		if(head == null) {
			System.out.println("Underflow");
		}
		Node2 temp = head;
		while(temp!=null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Node2 n1 = new Node2(5);
		Node2 n2 = new Node2(4);
		Node2 n3 = new Node2(3);
		
		append(n1);
		prepend(n2);
		prepend(n3);
		delete(2);
		display();
	}
	
	
	

}
