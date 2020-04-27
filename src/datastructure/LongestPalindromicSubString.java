package datastructure;

public class LongestPalindromicSubString {

	public static void main(String[] args) {
		String str = "forgeeksskeegfor";
		int start =0;
		int maxlength = 1;
		int low, high;
		int len = str.length();
		for (int i = 1; i < len; i++) {
			low = i-1;
			high = i;
			while(low >= 0 && high < len && str.charAt(low) == str.charAt(high)) {
				if(high - low+1 > maxlength) {
					start = low;
					maxlength = high - low +1;
				}
				--low;
				++high;
			}
			low = i-1;
			high = i+1;
			while(low >= 0 && high < len && str.charAt(low) == str.charAt(high)) {
				if(high - low+1 > maxlength) {
					start = low;
					maxlength = high - low +1;
				}
				--low;
				++high;
			}
		}
		System.out.println("Longest Palindromic SubString::"+ str.substring(start, start+maxlength));
		System.out.println("Length::"+str.substring(start, start+maxlength).length());

	}

}
