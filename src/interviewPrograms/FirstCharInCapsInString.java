package interviewPrograms;

public class FirstCharInCapsInString {
	
	static StringBuilder makeFirstLetterCapInSentense(String str) {
		StringBuilder sb = new StringBuilder();
		char ch = ' ';
		for (int i = 0; i < str.length(); i++) {
			if(ch == ' ' && str.charAt(i)!=' ')
				sb.append(Character.toUpperCase(str.charAt(i)));
			else
				sb.append(Character.toLowerCase(str.charAt(i)));
			ch = str.charAt(i);
			
		}return sb;
	}
	
	public static void main(String[] args) {
		System.out.println(makeFirstLetterCapInSentense("mY nAmE iS mAhEsH"));
	}

}
