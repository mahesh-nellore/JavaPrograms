package interviewPrograms;

import java.util.ArrayList;

public class ConsecutiveOccurrences {

	public static void main(String[] args) {
		
		String s = "aabbbbbbaaacbbbaaaa";
		char ch = s.charAt(0);
		int count = 0;
		
		for (int i = 0; i < s.length(); i++) {
			int temp = 1;
			for (int j = i+1; j < s.length(); j++) {
				if(s.charAt(i)!=s.charAt(j))
					break;
				temp++;
			}
			if(temp > count) {
				count = temp;
				ch = s.charAt(i);
			}
		}
		
		System.out.println("maximum occurence of a character ->"+ch+" : "+count);
		
		
		

	}

}
