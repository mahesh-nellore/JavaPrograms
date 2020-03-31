package interviewPrograms;

public class FindTheLongestPalindromicSubstring {

	public static void main(String[] args) {
		String str = "forgeeksskeegfor";
		//String str = "aaaabbaa";
		//String str = "maahesh";
		int max = 1;
		int start = 0;
		int low, high;
		int len = str.length();
		
		for(int i = 0; i < len; i++) {
			
			low = i-1;
			high = i;
			
			while(low>=0 && high < len && str.charAt(low)==str.charAt(high)) {
				if(high-low+1 > max) {
					start = low;
					max = high -low +1;
				}
				--low;
				++high;
			}
			low = i-1;
			high = i+1;
			
			while(low >= 0 && high < len && str.charAt(low)==str.charAt(high)) {
				if(high-low +1 > max) {
					start = low;
					max = high-low+1;
				}
				--low;
				++high;
			}
			
		}
		System.out.println(str.substring(start, start+max));

	}

}
