package interviewPrograms;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicatevalueInString {

	public static void main(String[] args) {
		String str = "mahesh priya vijwal mahesh rammohan";
		Set<String> set = new HashSet<String>();
		String [] words = str.split(" ");
		for (String string : words) {
			if(!set.add(string))
				System.out.println(string);
		}

	}

}
