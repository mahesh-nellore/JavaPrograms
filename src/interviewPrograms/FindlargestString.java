package interviewPrograms;

public class FindlargestString {

	public static void main(String[] args) {
	
		String str[] = {"Priya", "Mahesh", "Vij"};
		System.out.println(getValues(str));
		
	}
	
	public static String getValues(String array []) {
	
		String values = "";
		
		for (String string : array) {
			
			if(string.length() > values.length())
				values = string;
		}
		
		return values;
	}

}
