package javaconcepts;

import java.util.Arrays;

public class ArrayDemmo {
	
	
	public static void main(String[] args) {
		int ar[][] = { 
                {1, 2, 3}, 
                {4, 5, 6}, 
                {7, 8, 9} 
            }; 
		int row = ar.length;
		int col = ar[0].length;
		System.out.println("Row Count::"+ row);
		System.out.println("Column count::"+ col);
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				
				
				if(i < j) {
					int temp = ar[i][j];
					ar[i][j] = ar[j][i];
					ar[j][i]= temp;				}
				
			}
			
		}System.out.println(Arrays.deepToString(ar));
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col/2; j++) {
				int temp = ar[i][j];
				ar[i][j] = ar[i][col-1-j];
				ar[i][col-1-j] = temp;
				
			}
			
		}
		
		System.out.println(Arrays.deepToString(ar));
		
		
	}

}
