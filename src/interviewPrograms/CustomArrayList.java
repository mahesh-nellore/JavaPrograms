package interviewPrograms;
import java.util.Arrays;


class myList<E>{
	private Object[] customlist;
	private int elementCount = 0;
	
	public myList() {
		customlist = new Object[2];
	}
	
	public void add(E e) {
		if(elementCount == customlist.length-1)
			increaseSize();
		customlist[elementCount++] = e;
	}
	
	public E getIndex(int index) {
		if(index < elementCount)
			return (E)customlist[index];
		else
			throw new ArrayIndexOutOfBoundsException();
		
	}
	
	public Object remove(int index) {
		if(index < elementCount) {
			Object obj = customlist[index];
			int temp = index;
			while(temp < elementCount) {
				customlist[temp] = customlist[temp+1];
				customlist[temp+1] = null;
				temp++;
			}elementCount--;
			return obj;
		}else
			throw new ArrayIndexOutOfBoundsException();
	}
	
	private void increaseSize() {
		customlist = Arrays.copyOf(customlist, customlist.length*2);
		System.out.println("New Array List Size::"+customlist.length);
	}
	
	public int size() {
		return elementCount;
	}
	
	public int capacity() {
		return customlist.length;
	}
	
	public void printValues() {
		for(int i = 0; i < elementCount; i++) {
			System.out.println(customlist[i]);
		}
	}
}
public class CustomArrayList {
	
	
	public static void main(String[] args) {
		
		myList<Integer> ml = new myList<Integer>();
		ml.add(new Integer(1));
		ml.add(new Integer(2));
		ml.add(new Integer(3));
		ml.add(new Integer(4));
		ml.add(new Integer(5));
		ml.add(new Integer(6));
		ml.add(new Integer(7));
		ml.add(new Integer(8));
		ml.add(new Integer(9));
		
		ml.printValues();
		
		System.out.println("removing element at index 3::"+ml.remove(3));
		System.out.println("Print the values in the Array after removing the Index");
		ml.printValues();
		
		System.out.println("Get the value at the index 5::"+ml.getIndex(5));
		
		
	}

}
