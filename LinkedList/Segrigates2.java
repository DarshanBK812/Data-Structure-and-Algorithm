package LinkedList;

public class Segrigates2 {

    public static ListNode add(ListNode head, int data) {
        ListNode n = new ListNode(data);
        n.next = head;
        return n;
    }

    public static void print(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static int sum(ListNode head) {
        ListNode temp = head;
        int sum = 0;
        while (temp != null) {
            sum += temp.val;
            temp = temp.next;
        }
        return sum;
    }

    public static ListNode sort(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode zerosHead = new ListNode(-1);
        ListNode onesHead = new ListNode(-1);
        ListNode twosHead = new ListNode(-1);

        ListNode zerosTail = zerosHead;
        ListNode onesTail = onesHead;
        ListNode twosTail = twosHead;

        ListNode temp = head;
        while (temp != null) {
            if (temp.val == 0) {
                zerosTail.next = temp;
                zerosTail = zerosTail.next;
            } else if (temp.val == 1) {
                onesTail.next = temp;
                onesTail = onesTail.next;
            } else {
                twosTail.next = temp;
                twosTail = twosTail.next;
            }
            temp = temp.next;
        }

        // Connect segregated lists
        zerosTail.next = (onesHead.next != null) ? onesHead.next : twosHead.next;
        onesTail.next = twosHead.next;
        twosTail.next = null;

        return zerosHead.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1 = add(l1, 2);
        l1 = add(l1, 1);
        l1 = add(l1, 0);
        l1 = add(l1, 1);

        System.out.println("Sum of elements: " + sum(l1));
        System.out.println("Original List:");
        print(l1);

        ListNode sortedList = sort(l1);
        System.out.println("Sorted List:");
        print(sortedList);
    }
}
