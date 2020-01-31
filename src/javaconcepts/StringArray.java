package javaconcepts;

public class StringArray {

	public static void main(String[] args) {
		
	 String [] str = new String[4];
	 str[0] = "priya";
	 str[1] = "vamsi";
	 str[2] = "vijwal";
	 str[3] = "mahehs";
	 int j =0;
	 
	 for(int i=0; i<str.length; i++) {
		 System.out.println(str[i]);
		 
	 }
	 
	while(j < str.length) {
		
		System.out.println(str[j]);
		j++;
	}
	}

}
