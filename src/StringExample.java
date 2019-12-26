
public class StringExample {

	public static void main(String[] args) {
		String name = "mahesh,are you at home";
		String [] words = name.split(",");
		String reverse = "";
		String result= "";
		String str = words[0];
		for (int i = str.length()-1; i >= 0; i--) {
			reverse = reverse+str.charAt(i);
		}
		
		if(str.equals(reverse)) {
			for (int i = name.length()-1; i >=0; i--) {
				result = result+name.charAt(i);
				
			}System.out.println(result);
		}else {
			System.out.println(name);
		}
		
	}

}
