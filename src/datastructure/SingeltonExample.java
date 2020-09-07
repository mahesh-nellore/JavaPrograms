package datastructure;

public class SingeltonExample {

	public static void main(String[] args) {

		Singleton s1 = Singleton.getSingeltone();

	}

}

class Singleton{
	/*
	For any java class if we are able to create only object such type of class is called singleton class.
	Examples:
	Runtime
	ServiceLocator
	BusinessDelegate
	Advantage of Singleton class:
	If several people have same requirement then it is not recomended to create a separate object for every requirement.
	We have to create only one object and we can reuse the same object for every similar requirement to Improve performance and memory utilization.

*/
	private static Singleton singleton = null;
	
	private Singleton() {
		
	}
	
	public static Singleton getSingeltone() {
		if(singleton == null)
			singleton = new Singleton();
		return singleton;
	}
	
	
}
