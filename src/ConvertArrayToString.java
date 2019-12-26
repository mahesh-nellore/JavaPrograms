import java.util.HashSet;
import java.util.Set;

public class ConvertArrayToString {

	public static void main(String[] args) {
		int ar[] = {1,2,3,4,5};
		
		Set<Integer> set = new HashSet<>();
		for (int a : ar) {
			set.add(a);
		}
		
		
		for (Integer integer : set) {
			System.out.println(integer	);
		}
	}

}
