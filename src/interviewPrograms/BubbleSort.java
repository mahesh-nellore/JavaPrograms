package interviewPrograms;

public class BubbleSort {

	public static void main(String[] args) {
		int ar[] = {4,3,6,98,101,367,65,93};
		for (int i = 0; i < ar.length; i++) {
			for (int j = i+1; j < ar.length; j++) {
				if(ar[i] >ar [j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		System.out.println(ar[ar.length-1]);

	}

}
