package Linked_List;

// 1. Node class for Doubly Linked List
class DoubleNode {
    int data;
    DoubleNode prev, next;

    public DoubleNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

// 2. Methods class to handle insertions etc.
class DoubleMethods {
    DoubleNode head = null;
    DoubleNode tail = null;

    // Method to insert at end
    public void insertAtEnd(int data) {
        DoubleNode newNode = new DoubleNode(data);

        if (head == null) {
            head = tail = newNode; // First node
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode; // Move tail forward
        }
    }

    // Method to print list from start
    public void displayForward() {
        DoubleNode temp = head;
        System.out.print("Forward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Method to print list in reverse
    public void displayBackward() {
        DoubleNode temp = tail;
        System.out.print("Backward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
}

// 3. Main class
public class Doubly_Linked_List extends DoubleMethods {
    public static void main(String[] args) {
        Doubly_Linked_List list = new Doubly_Linked_List();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        list.displayForward();   // Output: Forward: 10 20 30 
        list.displayBackward();  // Output: Backward: 30 20 10 
    }
}

