package datastructure;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	public static void main(String[] args) {
		int ar[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
		List<Integer> list = new ArrayList<Integer>();
		int top = 0;
		int left = 0;
		int bottom = ar.length-1;
		int right = ar[0].length-1;
		int size = ar.length * ar[0].length;
		
		while(list.size() < size) {
			for(int i = left; i<= right && list.size()<size; i++) {
				list.add(ar[top][i]);
			}top++;
			for(int i = top; i<= bottom && list.size()<size; i++) {
				list.add(ar[i][right]);
			}right--;
			for(int i = right; i>= left && list.size()<size; i--) {
				list.add(ar[bottom][i]);
			}bottom --;
			for(int i = bottom; i>= top && list.size()<size; i--) {
				list.add(ar[i][left]);
			}left++;
		}
		
		System.out.println(list.toString());

	}

}
