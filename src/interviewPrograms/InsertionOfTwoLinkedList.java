package interviewPrograms;

import java.util.HashSet;
import java.util.Set;

class ListNode{
	int data;
	ListNode next;
	
	public ListNode(int data) {
		this.data = data;
		next = null;
	}
}

public class InsertionOfTwoLinkedList {
	
	public static Integer getIntersection(ListNode head1, ListNode head2) {
		Set<Integer> visited = new HashSet<Integer>();
		
		while(head1!=null) {
			visited.add(head1.data);
			head1 = head1.next;
		}
		while(head2!=null) {
			if(visited.contains(head2.data)) {
				return head2.data;
				
			}head2 = head2.next;
					  
		}return null;
		
	}

	public static void main(String[] args) {
		
		ListNode head1 = new ListNode(3);
		head1.next = new ListNode(6);
		head1.next.next = new ListNode(9);
		head1.next.next.next = new ListNode(15);
		head1.next.next.next.next = new ListNode(30);
		
		ListNode head2 = new ListNode(10);
		head2.next = new ListNode(15);
		head2.next.next = new ListNode(30);
		
		System.out.println(getIntersection(head1, head2));
		
		

	}

}
