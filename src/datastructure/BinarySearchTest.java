package datastructure;

public class BinarySearchTest {
	
	public static int binearySearch(int ar[], int n, int value) {
		int start = 0;
		int end = n;
		while(start < end) {
			int mid = (start+end-1)/2;
			if(value == ar[mid])
				return mid;
			if(value < ar[mid]) 
				end = mid-1;
			else 
				start = mid+1;
			
			
		}return -1;
	}

	public static void main(String[] args) {
		int ar[] = {3,6,8,12,14,17,25,29};
		int n = ar.length-1	;
		int result = binearySearch(ar, n, 3);
		System.out.println(result);
		if(result >= 0)
			System.out.println("Element found at position::"+result);
		else
			System.out.println("Element is not found in the Array");
		

	}

}
