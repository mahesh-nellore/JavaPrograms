package streams;

import java.util.Arrays;

public class DemoTest {
	
	public static void main(String[] args) {
		
		
		int ar[] = {3,5,4,2,8,7,9,12,30,33,11};
		
		
		int arrayindex = 0;
		int evenindex = 0;
		
		while(arrayindex < ar.length) {
			if(ar[arrayindex]%2 == 0) {
				int temp = ar[evenindex];
				ar[evenindex] = ar[arrayindex];
				ar[arrayindex]= temp;
				evenindex++;
			}arrayindex++;
		}
		
		for(int i = 0; i < evenindex; i++) {
			for(int j = i+1; j < evenindex; j++) {
				if(ar[i] > ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		for(int i = evenindex; i < ar.length; i++) {
			for(int j = i+1; j < ar.length; j++) {
				if(ar[i] > ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(ar));
		
	}

}
