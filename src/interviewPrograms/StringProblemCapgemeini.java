package interviewPrograms;


public class StringProblemCapgemeini {
	
	public static String getValue(String str, int n) {
		String reverse = "";
		int len = ((str.length()-1)-n);
		if(n == 0)
			reverse = str;
		for (int i = str.length()-1; i > len; i--) {
			reverse = reverse+str.charAt(i);
		}
		
		return reverse.concat(str.substring(0,len+1));
		
	}
	public static void main(String[] args) {
		String str = "abcdef";
		int n = 3;
		System.out.println(getValue(str, n));
	}

}
