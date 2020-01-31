package basicPrograms;

public class PrintPrimeNumbers {

	public static void main(String[] args) {
		// Print prime numbers from 1 to 10
		int num = 10;
		String primenumbers ="";
		int count;
		
		for (int i = 2; i <= num; i++) {
			count = 0;
			for (int j = i; j >=2; j--) {
				if((i%j)==0)
					count++;
			}
			if(count == 1)
				primenumbers+= i+" ";
		}
		
		System.out.println("Prime Numbers are::"+primenumbers);

	}

}
