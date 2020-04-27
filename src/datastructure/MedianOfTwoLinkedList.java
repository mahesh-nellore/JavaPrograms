package datastructure;

import java.util.HashSet;
import java.util.Set;



public class MedianOfTwoLinkedList {
	
	
	
	static Integer intersection(Node headA, Node headB) {
		Set<Integer>set = new HashSet<Integer>();
		while(headA.next!= null) {
			set.add(headA.data);
			headA = headA.next;
		}
		while (headB.next!=null) {
			if(set.contains(headB.data))
				return headB.data;
			headB = headB.next;
			
		}return null;
	}
	
	
		public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		LinkedList list1 = new LinkedList();
		list.insert(4);
		list.insert(1);
		list.insert(8);
		list.insert(4);
		list.insert(5);
		
		list1.insert(5);
		list1.insert(7);
		list1.insert(0);
		list1.insert(8);
		list1.insert(4);
		
		Node head1 = list.head;
		Node head2 = list1.head;
		
		Integer result = intersection(head1, head2);
		System.out.println(result);
	}
		
		

}
