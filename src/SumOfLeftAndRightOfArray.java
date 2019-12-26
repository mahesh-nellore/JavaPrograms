
public class SumOfLeftAndRightOfArray {

	public static void main(String[] args) {
		int ar [] = {1,4,1,1,0,7};
		int count = 0;
		int l = 0;
		int r = 0;
	
		for (int i = 0; i < ar.length; i++) {
			if(ar[i] != 0) {
				l = l+ar[i];
				count++;
			}else
				break;
			

	}for(int j = count+1; j <ar.length; j++) {
		r = r+ar[j];
	}
	if(l == r)
		System.out.println(ar[count]);
	else
		System.out.println("Condition not satisfied");
}

}
