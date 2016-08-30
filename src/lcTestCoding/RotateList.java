package lcTestCoding;

public class RotateList {

	public ListNode rotateRight(ListNode head, int k) {
		ListNode dummy = new ListNode(0);
		ListNode p = head;
		ListNode slow = dummy;
		int len = 0;
		while(p.next!=null){
			len++;
			p = p.next;
		}
		k = k%len;
		int j = 0;
		while( j <= len - k) {
			slow = slow.next;
			j++;
		}
		p.next = dummy.next;
		dummy.next = slow.next;
		slow.next = null;
		return dummy.next;
	}
	
	public ListNode rotateRight2(ListNode head, int n) {
	    if (head==null||head.next==null) return head;
	    ListNode dummy=new ListNode(0);
	    dummy.next=head;
	    ListNode fast=dummy,slow=dummy;

	    int i;
	    for (i=0;fast.next!=null;i++)//Get the total length 
	    	fast=fast.next;
	    
	    for (int j=i-n%i;j>0;j--) //Get the i-n%i th node
	    	slow=slow.next;
	    
	    fast.next=dummy.next; //Do the rotation
	    dummy.next=slow.next;
	    slow.next=null;
	    
	    return dummy.next;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
