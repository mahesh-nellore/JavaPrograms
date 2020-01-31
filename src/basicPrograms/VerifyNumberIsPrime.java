package basicPrograms;

public class VerifyNumberIsPrime {

	public static void main(String[] args) {
		int number = 23;
		System.out.println(number);

	}
	
	public static boolean isPrime(int number) {
		if(number%2==0)
			return false;
		for (int i = 3; i*i <=number; i+=2) {
			if(number%i==0)
				return false;
			}return true;
	}

}
