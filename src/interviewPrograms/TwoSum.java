package interviewPrograms;

import java.util.Arrays;

public class TwoSum {
	
	public static int[] twoSum(int[] nums, int target) {
		int [] ar = new int[2];
		int count = 0;
        for(int i = 0; i <nums.length; i++){
            for(int j = i+1; j <nums.length; j++){
                if(nums[i]+nums[j] == target) {
                	ar[count] = i;
                	ar[count+1] = j;
                	return ar;
                }
                    
            }
        }return null;
        
    }
	
	public static void main(String[] args) {
		int nums[] = {3,2,4};
		int target = 6;
		System.out.println(Arrays.toString(twoSum(nums, target)));
	}

}
