package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class MergeSortRecursive {
	
	public static void mergesort(int ar[], int lb, int ub) {
		if(lb < ub) {
			int mid = (lb+ub)/2;
			mergesort(ar, lb, mid);
			mergesort(ar, mid+1, ub);
			merge(ar, lb, mid, ub);
		}
		
	}
	public static void merge(int ar[], int lb, int mid, int ub) {
		int i = lb;
		int j = mid+1;
		int k = lb;
		int temp[] = new int [ar.length];
		
		while(i <= mid && j <= ub) {
			if(ar[i] <= ar[j]) {
				temp[k] = ar[i];
				i++;
			}else {
				temp[k] = ar[j];
				j++;
			}k++;
				
		}if(i > mid) {
			while(j <= ub) {
				temp[k] = ar[j];
				j++;
				k++;
			}
		}else {
			while(i <= mid) {
				temp[k] = ar[i];
				i++;
				k++;
			}
		}
		
		for(k = lb; k<=ub; k++) {
			ar[k] = temp[k];
		}
			
		
	}

	public static void main(String[] args) {
		int arraySize = 0;
		Random random = new Random();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Define the Array size::");
		try {
			arraySize = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			int ar[] = new int[arraySize];
			for (int i = 0; i < arraySize; i++) {
				ar[i] = random.nextInt(1000);
			}
			System.out.println("Original Array::"+Arrays.toString(ar));
			
			int lb = 0;
			int ub = arraySize-1;
			mergesort(ar, lb, ub);
			
			System.out.println("Array After Sorting::"+Arrays.toString(ar));
		
		

	}

}
