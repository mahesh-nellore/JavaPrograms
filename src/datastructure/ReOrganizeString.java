package datastructure;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class ReOrganizeString {

	public static String reOrganize(String str) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (Character ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		PriorityQueue<Character> maxHeap = new PriorityQueue<Character>((a, b) -> map.get(b) - map.get(a));
		maxHeap.addAll(map.keySet());
		StringBuilder sb = new StringBuilder();
		while (maxHeap.size() > 1) {
			char current = maxHeap.remove();
			char next = maxHeap.remove();
			sb.append(current);
			sb.append(next);
			map.put(current, map.get(current) - 1);
			map.put(next, map.get(next) - 1);
			if (map.get(current) > 0)
				maxHeap.add(current);
			if (map.get(next) > 0)
				maxHeap.add(next);
		}
		if(!maxHeap.isEmpty()) {
			char last = maxHeap.remove();
			if(map.get(last) > 1)
				return "";
			sb.append(last);
		}return sb.toString();

	}

	public static void main(String[] args) {
		String str = "aab";
		System.out.println(reOrganize(str));

	}

}
