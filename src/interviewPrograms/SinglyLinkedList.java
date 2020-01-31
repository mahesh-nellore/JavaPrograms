package interviewPrograms;
class Node{
	int data;
	Node next;
	
	
}

class LinkedList{
	Node head;
	
	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(head == null)
			head = node;
		else {
			Node n = head;
			while(n.next!=null) {
				n = n.next;
			}
			n.next = node;
		}
	}
	
	public void insertAtStart(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;
	}
	
	public void insertAt(int index, int data) {
		if(index == 0)
			insertAtStart(data);
		else {
			Node node = new Node();
			node.data = data;
			node.next = null;
			
			Node n = head;
			for(int i = 0; i <index-1; i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
	}
	public void deleteAt(int index) {
		if(index == 0)
			head = head.next;
		else {
			Node n = head;
			for(int i = 0; i < index-1; i++) {
				n = n.next;
			}
			Node n1 = n.next;
			n.next = n1.next;
			
			System.out.println("Deleted element::"+n1.data);
		}
		
	}
	public void show() {
		Node node = head;
		while(node.next!=null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
}
public class SinglyLinkedList {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(86);
		list.insert(16);
		list.insert(87);
		list.insertAtStart(22);
		list.insertAt(2, 34);
		list.deleteAt(2);
		list.show();

	}

}
