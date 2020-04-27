package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RotatematrixAntiClockWise {
	
	static void printmatrix(int ar[][]){
		int row = ar.length;
		int col = ar[0].length;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(ar[i][j]+" ");
			}System.out.println();
		}
		
		
		
	}

	public static void main(String[] args) {
		System.out.println("Enter the mattrix size");
		int max_size = 0;
		int count = 1;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		try {
			max_size = Integer.parseInt(bf.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int ar[][] = new int[max_size][max_size];
		int rowCount = ar.length;
		int colCount = ar[0].length;
		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				ar[i][j] = count++;
			}
		}
		
		printmatrix(ar);
		 System.out.println("------------------------");
		 for (int i = 0; i < rowCount; i++) {
				for (int j = 0; j < colCount; j++) {
					if(i < j) {
						int temp = ar[i][j];
						ar[i][j] = ar[j][i];
						ar[j][i] = temp;
					}
				}
			}
			for (int i = 0; i < rowCount/2; i++) {
				for (int j = 0; j < colCount; j++) {
					
						int temp = ar[i][j];
						ar[i][j] = ar[rowCount-1-i][j];
						ar[rowCount-1-i][j] = temp;
					
				}
			}
			printmatrix(ar);
		

	}

}
