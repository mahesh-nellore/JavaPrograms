package interviewPrograms;
import java.util.Scanner;

public class InterviewBasicLogicProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		for (int i = 1; i <=i*i; i++) {
			if(i*i == num) {
				System.out.println((i+1)*(i+1));
				break;
			}
		}

	}

}
