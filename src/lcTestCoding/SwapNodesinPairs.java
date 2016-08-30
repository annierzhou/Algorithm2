package lcTestCoding;

public class SwapNodesinPairs {
	 public ListNode swapPairs(ListNode head) {
		 if(head==null||head.next==null) return head;
		 ListNode next = head.next;
		 head.next = swapPairs(next.next);
		 next.next = head;
		 return next;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
