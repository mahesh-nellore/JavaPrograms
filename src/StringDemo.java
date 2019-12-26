import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringDemo {

	public static void main(String[] args) {
		
		String str = "shasnmsugsapsriyaaa";
		char[] ch = str.toCharArray();
		int count = 0;
		char res = 0;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : ch) {
			if(!map.containsKey(c))
				map.put(c, 1);
			else
				map.put(c, map.get(c)+1);
		}
		
		for (Map.Entry<Character, Integer> entry: map.entrySet()) {
			int temp = 0;
			if(entry.getValue() >1 && entry.getValue() >temp) {
				
				temp = entry.getValue();
				res = entry.getKey();
				count = temp;
			}
			
		}System.out.println(res+" "+count);
		
	}

}
