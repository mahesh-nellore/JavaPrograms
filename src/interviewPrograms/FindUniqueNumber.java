package interviewPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindUniqueNumber {
	static int d, c0, c1, c2, c3, c4, c5, c6, c7, c8, c9 = 0;

	public static void main(String[] args) {
		System.out.println("Enter the number");
		int num = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	try {
		num =	Integer.parseInt(br.readLine());
		
		while(num !=0) {
			
			d = num%10;
			
			switch(d)
			{
			case 0: c0++;
			break;
			case 1: c1++;
			break;
			case 2: c2++;
			break;
			case 3: c3++;
			break;
			case 4: c4++;
			break;
			case 5: c5++;
			break;
			case 6: c6++;
			break;
			case 7: c7++;
			break;
			case 8: c8++;
			break;
			case 9: c9++;
			break;
			}
			num = num/10;
			
		}
		if(c0>1 || c1>1 || c2>1 || c3>1 || c4>1 || c5>1 || c6>1 || c7>1 || c8>1 || c9>1)
			System.out.println("The given number is not unique");
		else
			System.out.println("The given number is unique");
		
		
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	}

}
