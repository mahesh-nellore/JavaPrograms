import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

public class StackExample {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		stack.push("Mahesh");
		stack.push("Priya");
		stack.push("Vijwal");
		
		String firstElement = stack.pop();
		System.out.println(firstElement);
		System.out.println("Stack::"+stack);
		stack.push("Vijwal");
		System.out.println("Stack::"+stack);
		
		Iterator itr = stack.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
