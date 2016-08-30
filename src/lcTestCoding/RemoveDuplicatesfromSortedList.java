package lcTestCoding;

public class RemoveDuplicatesfromSortedList {
	/*
	 * Given 1->1->2->3->3, return 1->2->3. 
	 */
	public ListNode deleteDuplicates(ListNode head) {
		if(head == null || head.next == null) return head;
		head.next = deleteDuplicates(head.next);
		if(head.val == head.next.val) return head.next;
		else return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
