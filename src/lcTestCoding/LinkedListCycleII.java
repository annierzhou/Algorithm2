package lcTestCoding;

public class LinkedListCycleII {
	public ListNode detectCycle(ListNode head) {
		if(head == null) return null;
		ListNode slow = head;
		ListNode fast = head;
		boolean hasCycle = false;
		while(fast!= null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				hasCycle = true;
				break;
			}
		}
		if(!hasCycle) return null;
		fast = head;
		while(fast != slow) {
			fast = fast.next;
			slow = slow.next;
		}
		return slow;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
