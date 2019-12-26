
public class FindlargestString {

	public static void main(String[] args) {
	
		String str[] = {"Priya", "Mahesh", "Vij"};
		System.out.println(getValues(str));
		String na1 = "Hello";
		String nas = "World";
		String na = "";
		na = na + (na1 + nas);
		System.out.println("***************"+na);

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
