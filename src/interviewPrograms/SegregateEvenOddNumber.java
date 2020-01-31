package interviewPrograms;

public class SegregateEvenOddNumber {

	public static void main(String[] args) {
		int ar[] = {3,2,5,4,7,6,9,8,10};
		int arrayindex =0;
		int evenindex = 0;
		
		while(arrayindex < ar.length) {
			if(ar[arrayindex] % 2 == 0) {
				int temp = ar[evenindex];
				ar[evenindex] = ar[arrayindex];
				ar[arrayindex] = temp;
				
				evenindex ++;
			}
			
			arrayindex ++;	
		}

	}

}
