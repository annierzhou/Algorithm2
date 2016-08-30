package lcTestCoding;

public class RemoveNthNodeFromEndofList {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if(head == null) return null;
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode p1 = dummy;
		for( int i =0; i <n; i ++) {
			p1 = p1.next;
		}
		ListNode p2 = dummy;
		while(p1.next!=null) {
			p1 = p1.next;
			p2 = p2.next;
		}
		p2.next = p2.next.next;
		return dummy.next;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
