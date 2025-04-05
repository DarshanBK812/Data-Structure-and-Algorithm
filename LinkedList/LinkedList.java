package LinkedList;

import java.util.Arrays;

public class LinkedList {
	
	//Add two lists and sort by even and odd
	public ListNode addTwoList(ListNode l1 , ListNode l2) {
		
		ListNode dummy = new ListNode(0);
		ListNode current = dummy;
		int carry = 0;
		
		while(l1 != null || l2 != null || carry != 0) {
			
			int x = (l1 != null) ? l1.val : 0;
			int y = (l2 != null) ? l2.val : 0;
			
			int sum = x+y+carry;
			carry = sum / 10;
			int newVal = sum % 10;
			
			current.next = new ListNode(newVal);
			current = current.next ;
			
			if(l1 != null) l1 = l1.next;
			if(l2 != null) l2 = l2.next;
			
		}
		return dummy.next;
	}

	
	public static ListNode prepend(ListNode l , int data) {
		ListNode n = new ListNode(data);
		n.next = l;
		l = n;
		
		return l;
	}
	
	public static void printList(ListNode l) {
		ListNode temp = l;
		while(temp != null) {
			System.out.print(temp.val + "-->");
			temp = temp.next;
		}
		System.out.println("null");
	}
	public static  int size(ListNode l) {
		int count = 0;
		ListNode temp = l;
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	public static ListNode evenOdd(ListNode l) {
		
		int arr [] = new int[size(l)];
		
		ListNode temp = l;
		printList(temp);

		int e = 0;
		
		while(temp != null) {
			if(temp.val % 2 == 0) {
				e++;
			}
			temp = temp.next;
		}
		
		int eArr [] = new int[e];
		int oArr [] = new int[size(l) - e];
		
		int eIndex = 0 , oIndex = 0; 
		
		
		 temp = l;
			

		 System.out.println("start");
		while(temp != null) {
			printList(temp);
			if(temp.val % 2 == 0) {
				eArr[eIndex++] = temp.val;
			}else {
				oArr[oIndex++] = temp.val;
			}
			
			temp = temp.next;
		}
		 System.out.println("Stop");
		 
		 
		printList(temp);
		System.out.println(Arrays.toString(eArr));
		System.out.println(Arrays.toString(oArr));
		
		
		int index2 = 0;
		Arrays.sort(eArr);
		Arrays.sort(oArr);
		for(int i = 0 ; i<e ; i++) {
			arr[index2++] = eArr[i];
		}
		for(int i = 0 ; i<(size(l) - e) ; i++) {
			arr[index2++] = oArr[i];
		}
		System.out.println(Arrays.toString(arr));
		
		
		index2 = 0;
		temp = l;
	
		while(temp != null) {
			temp.val = arr[index2++];
			temp = temp.next;
		}
		
		printList(temp);
		System.out.println("ends");
		
		return l;
	}
	
	public static void main(String[] args) {
		
		LinkedList sol = new LinkedList();
		
		ListNode list1 = new ListNode(2);
		list1.next = new ListNode(3);
		list1.next.next = new ListNode(4);
		list1 = prepend(list1 ,1);
		list1 = prepend(list1 ,5);
		list1 = prepend(list1 ,6);
		sol.printList(list1);
		evenOdd(list1);
		
		
//		ListNode list2 = new ListNode(2);
//		list2.next = new ListNode(4);
//		list2.next.next = new ListNode(4);
//		
//		ListNode result = sol.addTwoList(list1 , list2);
//		
//		sol.printList(list1);
//		sol.printList(list2);
//		sol.printList(result);
//		
		
	}

}
