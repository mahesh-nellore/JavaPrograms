package interviewPrograms;

public class ReverseAString {
	
	public static void main(String[] args) {
		String str = "Mahesh";
		System.out.println(reverse(str));
	}
	
	public static String reverse(String str) {
		String reverse = "";
		for (int i = str.length()-1; i >=0; i--) {
			reverse+= str.charAt(i);
		}return reverse;
	}

}
