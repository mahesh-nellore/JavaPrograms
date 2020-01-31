package interviewPrograms;

public class MissingNumberInSeries {

	public static void main(String[] args) {
		int ar[] = {1,2,4,5,6};
		int sum = (ar.length)*(ar.length+1)/2;
		int total = 0;
		for (int i : ar) {
			total+= i;
		}
		int missingNumber = (total-sum);
		System.out.println("The Missing Number is: "+missingNumber);

	}

}
