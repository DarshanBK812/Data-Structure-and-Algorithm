package DS;

public class Dll {
	static Node2 head = null;
	static Node2 tail = null;
	static int count = 0;
	public static void append(Node2 n) {
		if(head == null && tail == null) {
			head = n ;
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
			head = n ;
			tail = n;
		}
		else {
			n.next = head;
			head.prev = n;
			head = n;
		}
		count++;
	}
	public static void mid(Node2 n , int pos) {
		if(pos<=0 || pos >count+1) {
			System.out.println("Invalid option");
			return;
		}
		if(pos == 0) {
			prepend(n);
		}
		else if(pos == count+1) {
			append(n);
		}
		else {
			Node2 temp = head;
			System.out.println("pos :" + pos);
			for(int i = 1;i<pos-1;i++) {
				temp=temp.next;
			}
			n.next = temp.next;
			n.prev = temp;
			temp.next.prev = n;
			temp.next = n; 
		}
		
		count++;
	}
	public static void del(int pos) {
		System.out.println( "count : "+ count + " pos :" + pos  );

		if(head == null && tail == null) {
			System.out.println("Nothing to delete");
			return;
		}
		if(pos <= 0 || pos > count) {
			System.out.println("Invalid Option");
			return;
		}
		
		if(pos == 1) {
			Node2 temp = head;
			head = head.next;
			if(head!=null) {
				head.prev = null;
			}
			else {
				tail = null;
			}
			temp = null;
		}
		else if(pos == count) {
			Node2 temp = tail;
			tail = tail.prev;
			if(tail!=null) {
				tail.next = null;
			}else {
				head = null;
			}
			temp = null;
			
		}
		else {
			Node2 temp = head;
			for(int i =1;i<pos;i++) {
				temp = temp.next;
			}
			n.next = temp.next;
			n.prev = temp;
			temp.next.prev = n;
			temp.next = n;
		}
		count--;
	}
	
	
	
	public static void display() {
	    if (head == null) {
	        System.out.println("The list is empty.");
	        return;
	    }
	    Node2 temp = head;
	    while (temp != null) {
	        System.out.print(temp.data + " ");
	        temp = temp.next;
	    }
	    System.out.println();
	}
public static void main(String args []) {
		
		Node2 n1 = new Node2(10);
		Node2 n2 = new Node2(20);
		Node2 n3 = new Node2(15);
		Node2 n4 = new Node2(30);
		Node2 n5 = new Node2(5);
		Node2 n6 = new Node2(25);
		prepend(n1);
		append(n2);
		//append(n4);
		mid(n3 , 2);
		mid(n4 , 4);
		prepend(n5);
		mid(n6, 5);
		del(3);
		
		//del(2);
		display();
	}

}
