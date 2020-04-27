package datastructure;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MostCommonWord {
	
	public static String mostCommonWord(String paragraph, String [] banned) {	
		HashSet<String>bannedWords = new HashSet<String>();
		for (String string : banned) {
			bannedWords.add(string);
		}
		Map<String, Integer>map = new HashMap<String, Integer>();
		for (String string : paragraph.replaceAll("[^a-zA-Z]", " ").toLowerCase().split(" ")) {
			if(!bannedWords.contains(string)) {
				map.put(string, map.getOrDefault(string, 0)+1);
			}
			
		}
		String result="";
		for(String key: map.keySet()) {
			if(result.equals("") || map.get(key) > map.get(result))
				result = key;
		}return result;
		
	}

	public static void main(String[] args) {
		String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String [] banned = {"hit"};
		System.out.println(mostCommonWord(paragraph, banned));
	}

}
