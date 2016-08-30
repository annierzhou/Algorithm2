package lcTestCoding;

public class RemoveDuplicatesfromSortedListII {
	/*
	 * Given 1->2->3->3->4->4->5, return 1->2->5.
Given 1->1->1->2->3, return 2->3. 
	 */
	public ListNode deleteDuplicates(ListNode head) {
		if(head == null || head.next == null) return head;
		if(head.val!=head.next.val) {
			head.next = deleteDuplicates(head.next);
			return head;
		} else {
			while(head.next != null && head.val == head.next.val) {
				head = head.next;
			}
			return deleteDuplicates(head.next);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
