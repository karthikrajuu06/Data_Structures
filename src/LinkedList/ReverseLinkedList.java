package LinkedList;

import java.util.List;

public class ReverseLinkedList {

	public ListNode reverseWithsp (ListNode head) {
		// edge  cases
		if(head==null) {
			return  null;
		}
		if(head.next == null ) {
			return head;
		}
		ListNode preNode = null;
		ListNode currNode = head;
		
		while(currNode!= null) {
			ListNode nextNode = currNode.next;
			currNode = nextNode;
			
		}
		head = preNode;
		return head;	
	}
	public void traverse(ListNode head) {
		
	}

	public static void main(String[] args) {
		//creating node
		ListNode l1 = new ListNode(5);
		ListNode l2 = new ListNode(10);
		ListNode l3 = new ListNode(15);
		ListNode l4 = new ListNode(20);
		// linking to nodes
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = null;
		
		ListNode head = l1;
		
		
				
	

	}
}


