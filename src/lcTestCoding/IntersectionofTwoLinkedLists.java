package lcTestCoding;

public class IntersectionofTwoLinkedLists {
	
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if( null==headA || null==headB )
			return null;
		ListNode a = headA, b = headB;
		while( a!=b){
			a = a==null?headB:a.next;
			b = b==null?headA:b.next;
			 if (a == headA && b == headB){
	                return null;
	            }
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
