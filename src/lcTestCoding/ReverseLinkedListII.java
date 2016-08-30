package lcTestCoding;

public class ReverseLinkedListII {
	public ListNode reverseBetween0(ListNode head, int m, int n) {
		if(head == null) return null;
		ListNode dummy = new ListNode(0); // create a dummy node to mark the head of this list
		dummy.next = head;
		ListNode pre = dummy; // make a pointer pre as a marker for the node before reversing
		for(int i = 0; i<m-1; i++) pre = pre.next;
		ListNode start = pre.next; // a pointer to the beginning of a sub-list that will be reversed
		ListNode then = start.next; // a pointer to a node that will be reversed
		// 1 - 2 -3 - 4 - 5 ; m=2; n =4 ---> pre = 1, start = 2, then = 3
		// dummy-> 1 -> 2 -> 3 -> 4 -> 5
		for(int i=0; i<n-m; i++)
		{
			start.next = then.next;
			then.next = pre.next;
			pre.next = then;
			then = start.next;
		}
		// first reversing : dummy->1 - 3 - 2 - 4 - 5; pre = 1, start = 2, then = 4
		// second reversing: dummy->1 - 4 - 3 - 2 - 5; pre = 1, start = 2, then = 5 (finish)
		return dummy.next;	    
	}

	public ListNode reverseList(ListNode head) {
		if(head==null || head.next==null)
			return head;
		ListNode nextNode=head.next;
		ListNode newHead=reverseList(nextNode);
		nextNode.next=head;
		head.next=null;
		return newHead;
	}

	public ListNode reverseBetween(ListNode head, int m, int n) {
		ListNode p1 = head;
		ListNode p2 = head;
		for(int i = 0; i < m -1; i ++) {
			p1 = p1.next; 
		}
		ListNode q1 = p1.next;	
		p1.next = null;
		for(int i = 0; i < n ; i ++) {
			p2 = p2.next;
		}
		ListNode q2 = p2.next;
		p2.next = null;
		ListNode newH = reverseList(q1);
		p1.next = newH;
		q1.next = q2;
		return head;
	}
	private ListNode reverse_rec(ListNode start, int count){
		if(count == 0 || start == null)
			return start;

		ListNode newTail = reverse_rec(start.next, count-1);
		newTail.next = start;
		start.next = null;

		return start;
	}
}
