package interviewPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MapProgram {

	public static void main(String[] args) {
		String str = "mahesh priya mahesh vijwal priya mahesh venkat";
		String [] words = str.split(" ");
		Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();
		for (int i = 0; i < words.length; i++) {
			LinkedList<Integer> list = new LinkedList<Integer>();
			String word = words[i];
			if(!map.containsKey(word)) {
				list.add(1);
				list.add(i);
				map.put(word,list);
			}else {
				list.add(map.get(word).get(0)+1);
				list.add(i);
				map.put(word, list);
							
			}
		}
	for(Map.Entry<String, List<Integer>> entry: map.entrySet()) {
		System.out.println(entry.getKey()+" "+Arrays.asList(entry.getValue()));
	}

	}

}
