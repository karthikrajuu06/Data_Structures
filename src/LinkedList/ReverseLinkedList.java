package LinkedList;

// Definition for singly-linked list node.
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { 
        this.val = val; 
    }
}

public class ReverseLinkedList {

    public ListNode reverseWithsp(ListNode head) {
        // Edge cases
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        
        ListNode preNode = null;
        ListNode currNode = head;
        
        while (currNode != null) {
            ListNode nextNode = currNode.next; // Save the next node
            currNode.next = preNode;           // Reverse the link (points backward)
            preNode = currNode;                // Move preNode forward
            currNode = nextNode;               // Move currNode forward
        }
        
        head = preNode; // preNode will be pointing to the new head at the end
        return head;    
    }
    
    // Prints the linked list elements in sequence
    public void traverse(ListNode head) {
        ListNode currNode = head;
        while (currNode != null) {
            System.out.print(currNode.val + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Creating nodes
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(10);
        ListNode l3 = new ListNode(15);
        ListNode l4 = new ListNode(20);
        
        // Linking the nodes
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = null;
        
        ListNode head = l1;
        
        ReverseLinkedList solution = new ReverseLinkedList();
        
        System.out.println("Original List:");
        solution.traverse(head);
        
        // Reversing the list
        head = solution.reverseWithsp(head);
        
        System.out.println("Reversed List:");
        solution.traverse(head);
    }
}
