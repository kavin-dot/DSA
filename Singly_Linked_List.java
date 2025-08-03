package Linked_List;
// node class
class Node {
	int data; // 0
	Node next; // he is just a reference variable for node class
	// he inilize the instant variable

	public Node(int data) { // 0
		this.data = data;
		next = null;
	}
}
// method class
class Methods {
	static Node head = null;
	public static void insertAtBeg(int data) { // 0
		Node newNode = new Node(data); // 0
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}
	public static void print() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
}
// main class
public class Singly_Linked_List extends Methods {
	public static void main(String[] args) {
		insertAtBeg(0);
		insertAtBeg(1);
		print();
		
	
	}
}