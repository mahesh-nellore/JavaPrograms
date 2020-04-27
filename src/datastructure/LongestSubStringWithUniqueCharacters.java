package datastructure;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithUniqueCharacters {

	public static void main(String[] args) {
		String str = "ABDEFGABEF";
		int i = 0;
		int j = 0;
		int max = 0;
		Set<Character>set = new HashSet<Character>();
		while(j < str.length()) {
			if(!set.contains(str.charAt(j))){
				set.add(str.charAt(j));
				j++;
				max = Math.max(set.size(), max);
			}else {
				set.remove(str.charAt(i));
				i++;
			}
		}
		System.out.println("Longest unique substring length:"+max);
		System.out.println("Longest unique substring:"+set.toString());

	}

}
