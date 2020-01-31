package interviewPrograms;
import java.util.HashMap;
import java.util.Map;

public class RepeatedCharacters {

	public static void main(String[] args) {
		String str = "aabbbaaacdccccbb";
		char ch [] = str.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : ch) {
			if(map.containsKey(c))
				map.put(c, map.get(c)+1);
			else
				map.put(c, 1);
		}
		
		for (Map.Entry<Character, Integer> entry: map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+" "+entry.getValue());
			}
			
		}

	}

}
