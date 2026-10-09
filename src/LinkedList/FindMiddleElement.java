package LinkedList;

public class FindMiddleElement {
	
	public ListNode middleNode(ListNode head) {
		
		ListNode slow = head;
		ListNode fast = head;
		while(fast != null && fast.next!=null) {
	           
			slow = slow.next;
			fast  =fast.next.next;
		
	}
		return slow;
	}
	// traverse 
	public void traverse(ListNode head) {
		ListNode ptr = head;
		while(ptr!=null) {
			System.out.println(ptr.val+"->");
			ptr = ptr.next;
		}
	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(78);
		ListNode l2 = new ListNode(80);
		ListNode l3 = new ListNode(90);
		ListNode l4 = new ListNode(24);
		// ListNode l5 = new Listnode(11);
		
		// linking
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		//l5.next = null;
		
		ListNode head = l1;
		System.out.println("");
		
		

	}

}
