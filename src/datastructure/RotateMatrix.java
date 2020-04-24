package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RotateMatrix {
	
	public static void printmatrix(int ar[][]) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				System.out.print(ar[i][j]+" ");
			}System.out.println();
		}
	}

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Matrix size");
		int length = 0;
		int count = 1;
		
		try {
			length = Integer.parseInt(br.readLine());
			System.out.println("User Entered matrix Length::"+length);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int ar[][] = new int[length][length];
		// Create a n*n matrix
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				ar[i][j] = count++;
			}
		}
		System.out.println("---Print The Initial Created Array---");
		printmatrix(ar);
		System.out.println("--------------------------------");
		
		int rowcount = ar.length;
		int colcount = ar[0].length;
		
		//Rotate the Array
		for (int i = 0; i < rowcount; i++) {
			for (int j = 0; j < colcount; j++) {
				if(i < j) {
					int temp = ar[i][j];
					ar[i][j] = ar[j][i];
					ar[j][i] = temp;
				}
				
			}
		}
		for (int i = 0; i < rowcount; i++) {
			for (int j = 0; j < colcount/2; j++) {
				int temp = ar[i][j];
				ar[i][j] = ar[i][colcount-1-j];
				ar[i][colcount-1-j] = temp;
			}
		}
		System.out.println("---Print the Array after Rotation---");
		printmatrix(ar);
		System.out.println("------------------------------------");
		
	

	}

}
