package datastructure;

import java.util.Stack;

  class MyNode{
	int data;
	MyNode next;
	public MyNode(int data) {
		this.data = data;
		next = null;
	}
	public static boolean isPalindrome(MyNode head) { if(head == null || head.next ==
			  null) return true; Stack<Integer> s = new Stack<Integer>(); MyNode slow =
			  head; MyNode fast = head;
			  
			  while(fast != null && fast.next!=null) { 
				  s.push(slow.data); 
				  slow = slow.next; 
				  fast = fast.next.next; 
			  }if(fast!=null)
				  slow = slow.next;
			  while(slow != null) {
				  if(s.pop() != slow.data)
					  return false;
				  slow = slow.next;
			  }return true;
			  
			  
			  
			  }
}

public class IsLinkedListPalindrome {
	static MyNode head, headA;
	public static void main(String[] args) {
		
		IsLinkedListPalindrome list = new IsLinkedListPalindrome();
		list.head = new MyNode(1);
		list.head.next = new MyNode(2);
		list.head.next.next = new MyNode(3);
		list.head.next.next.next = new MyNode(2);
		list.head.next.next.next.next = new MyNode(1);
		
		headA = list.head;
		
		if(MyNode.isPalindrome(headA))
			System.out.println("The given list is palindrome");
		else
			System.out.println("The given list is not palindrome");
		
	}		
	
}
