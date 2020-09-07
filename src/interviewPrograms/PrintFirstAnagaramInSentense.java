package interviewPrograms;

import java.util.Arrays;

public class PrintFirstAnagaramInSentense {
	
	static String printFirstAnagaram(String str) {
		
		String [] words = str.toLowerCase().split(" ");
		for (int i = 0; i < words.length; i++) {
			for (int j = i+1; j < words.length; j++) {
				// find the equal length words in a String
				if(words[i].length() == words[j].length()) {
					/*
					 * sort the words and compare whether its a Anagarm or not
					 * Convert the words in to array
					 */
					char [] ch = words[i].toCharArray();
					Arrays.sort(ch);
					char [] ch1 = words[j].toCharArray();
					Arrays.sort(ch1);
					if(String.copyValueOf(ch).equals(String.copyValueOf(ch1)))
						return words[i];
					
				}
				
			}
			
		}return null;
		
		
	}
	public static void main(String[] args) {
		String str = "The dog is barking at god idel";
		System.out.println(printFirstAnagaram(str));
	}

}
