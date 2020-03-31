package interviewPrograms;

import java.util.LinkedHashMap;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		String str = "abcabcbb";
		char[] ch = str.toCharArray();
		String value = null;
		int length = 0;
		
		LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<Character, Integer>();
		
		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];
			
			if(!lhm.containsKey(c)) {
				lhm.put(c, i);
			}else {
				i = lhm.get(c);
				System.out.println("The Value::"+i);
				lhm.clear();
			}
			if(lhm.size()>length) {
				value = lhm.keySet().toString();
				length = lhm.size();
			}
		}
		System.out.println("The Longest SubString"+value);
		System.out.println("The Length of the Longest Substring::"+length);

	}

}
