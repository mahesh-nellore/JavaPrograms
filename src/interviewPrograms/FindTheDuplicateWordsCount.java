package interviewPrograms;
import java.util.HashMap;
import java.util.Map;

public class FindTheDuplicateWordsCount {

	public static void main(String[] args) {
		String str = "Madras Bangalore madras mangalore madras bangalore Bodi MAdras";
		String words [] = str.toUpperCase().split(" ");
		Map<String, Integer>map = new HashMap<String, Integer>();
		for (String string : words) {
			if(map.containsKey(string))
				map.put(string, map.get(string)+1);
			else
				map.put(string, 1);
		}
		
		for(Map.Entry<String, Integer> entry : map.entrySet() ) {
			if(entry.getValue()>1)
				System.out.println(entry.getKey()+" "+entry.getValue());
			else
				System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
