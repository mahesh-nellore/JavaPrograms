package interviewPrograms;
      
public class ReverseOnlyAlphacharactersInString {

	public static void main(String[] args) {
		String str = "M@he,sh";
		char [] values = str.toCharArray();
		
		int l=0;
		int r = str.length()-1;
		
		while (l < r) {
			
			if(!Character.isAlphabetic(values[l])) {
				l++;
			}else if(!Character.isAlphabetic(values[r])){
				r--;
				
			}else
			{
				char temp = values[l];
				values[l] = values[r];
				values[r] = temp;
				
				l++;
				r--;
			}
			
		}
		
		String reverse = new String(values);
		System.out.println(reverse);
		

	}

}
