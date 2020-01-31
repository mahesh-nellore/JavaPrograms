package javaconcepts;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String>queue = new LinkedList<>();
		queue.add("Mahesh");
		queue.add("Priya");
		queue.add("Vijwal");
		
		String firstElement = queue.peek();
		System.out.println(firstElement);
		
		System.out.println(queue);
		
		String element = queue.poll();
		System.out.println(element);
		
		System.out.println(queue);
		
		String removeElement = queue.remove();
		System.out.println(removeElement);
		
		System.out.println(queue);
		
		

	}

}
