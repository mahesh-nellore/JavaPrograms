package interviewPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class Demo {
	
	

	public static void main(String[] args) {
		String str = "mahesh priya mahesh vijwal priya mahesh venkat";
		String [] words = str.split(" ");
		Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			if(!map.containsKey(word)) {
				map.computeIfAbsent(word, K ->new LinkedList<Integer>()).add(1);
				map.computeIfAbsent(word, K ->new LinkedList<Integer>()).add(i);
			}else {
				map.computeIfAbsent(word, K ->new LinkedList<Integer>()).add(map.get(word).get(0)+1);
				map.computeIfAbsent(word, K ->new LinkedList<Integer>()).add(i);				
			}
		}
		
		for(Map.Entry<String, List<Integer>> entry: map.entrySet()) {
			System.out.println(entry.getKey()+" "+Arrays.asList(entry.getValue()));
		}
		
	}

}
