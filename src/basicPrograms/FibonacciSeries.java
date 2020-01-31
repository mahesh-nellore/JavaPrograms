package basicPrograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		// print fibonacci series till 7
		
		int a = 0;
		int b = 1;
		
		for (int i = 1; i <= 7; i++) {
			System.out.println(a+" ");
			int temp = a+b;
			a = b;
			b = temp;
		}

	}

}
