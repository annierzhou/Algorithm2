package lcTestCoding;

public class AddTwoNumbers {
	/*
	 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
	 */
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if(l1 == null && l2 == null) return null;
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		int a = l1.val + l2.val;
		ListNode sum = new ListNode(a % 10);
		sum.next = addTwoNumbers(l1.next, l2.next);
		if(a >= 10) sum.next = addTwoNumbers(sum.next, new ListNode(1));
		return sum;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
