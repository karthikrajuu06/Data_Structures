package LinkedList;



	public static void main(String[] args) {
		// TODO Auto-generated package LinkedList;

public class FirstLinkedList {
    
    // 1. Define the Node structure
    static class Node {
        int data;
        Node next;

        // Constructor to create a new node
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of the list
    Node head;

    // 2. Method to insert a new node at the end of the list
    public void insert(int data) {
        Node newNode = new Node(data);

        // If the list is empty, make the new node the head
        if (head == null) {
            head = newNode;
            return;
        }

        // Otherwise, traverse to the last node
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        // Link the last node to the new node
        current.next = newNode;
    }

    // 3. Method to display the linked list
    public void display() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;s
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create an instance of the linked list
        FirstLinkedList list = new FirstLinkedList();

        // Insert some elements
        list.insert(10);
        list.insert(20);
        list.insert(30);

        // Print the list
        System.out.println("Linked List elements:");
        list.display();
    }
}
method stub

	}

}
