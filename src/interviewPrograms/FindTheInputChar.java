package interviewPrograms;

public class FindTheInputChar {

	public static void main(String[] args) {
		char ch = '0';
		
		if(ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122)
			System.out.println("Given Character is Alphabet");
		else if(ch >= 48 && ch <= 57)
			System.out.println("Given Character is Digit");
		else
			System.out.println("Given Character is Special Character");
		
	}

}
