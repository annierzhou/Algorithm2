package lcTestCoding;

public class ReverseLinkedList {

	public ListNode reverseList1(ListNode head) {
	    /* iterative solution */
	    ListNode p0 = null;
	    while (head != null) {
	        ListNode p2 = head.next;
	        head.next = p0;
	        p0 = head;
	        head = p2;
	    }
	    return p0;
	    
	}
	public ListNode reverseList2(ListNode head) {
		if(head==null || head.next==null)
			return head;
		ListNode nextNode=head.next;
		ListNode newHead=reverseList2(nextNode);
		nextNode.next=head;
		head.next=null;
		return newHead;
	}

}
