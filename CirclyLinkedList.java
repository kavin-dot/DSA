package Linked_List;

class CNode{
	int data;
	CNode next;
	public CNode(int data) {
		this.data=data;
		next=null;
	}
}
class CMethod{
	static CNode head=null, tail=null;
	public static void insertAtBeg(int data) {
		CNode newnode=new CNode(data);
		if(head==null) {
			head=newnode;
			tail=newnode;
			return;
		}
		else {
			newnode.next=head;
			head=newnode;
			tail.next=head;
		}
	}
	public static void insertAtEnd(int data) {
		CNode newnode=new CNode(data);
		if(head==null) {
			head=newnode;
			tail=newnode;
		}
		else {
			newnode.next=head;
			tail.next=newnode;
			tail=newnode;
		}
	}
	public static void insertAtPos (int pos,int data) {
		if(pos==0) {
			insertAtBeg(data);
			return;
		}
		CNode newnode= new CNode(data);
		CNode temp= head;
		int i=0;
		while(i<pos-1) {
			temp=temp.next;
			i++;
		}
			newnode.next=temp.next;
			temp.next=newnode;
	}
	
	public static void print() {
		CNode temp=head;
		do {
			System.out.println(temp.data);
			temp=temp.next;
		}
		while(temp!=head);
	}
}
public class CirclyLinkedList extends CMethod {
	public static void main(String[] args) {
		insertAtBeg(0);
		insertAtBeg(1);
		insertAtBeg(2);
		insertAtEnd(3);
		insertAtEnd(4);
		insertAtPos(5, 5);
		System.out.println(tail.data);
		print();
	}

}
