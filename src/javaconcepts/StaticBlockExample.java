package javaconcepts;

public class StaticBlockExample {
	
	public static String name;
	
	
	static {
		name = "Priya";
		System.out.println(name);
		System.exit(0);
	}
	
	

}
