import java.util.HashMap;
import java.util.Map;

public class ConsecutiveOccurrences {

	public static void main(String[] args) {
		
		String s = "aabbaaacbbbaaaa";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] ch = s.toCharArray();
		for(int i = 0; i< ch.length; i++) {
			int count = 1;
			while(ch[i] == ch[i+1]) {
				i++;
				count++;
				if(i+1 == ch.length)
					break;
				
			}
			if(!map.containsKey(ch[i]))
				map.put(ch[i], count);
			else {
				if(map.get(ch[i]) < count) {
					map.remove(ch[i]);
					map.put(ch[i], count);
				}
			}
		}
		
		for(Map.Entry<Character, Integer>entry : map.entrySet())
			System.out.println(entry.getKey()+":"+entry.getValue());
		

	}

}
