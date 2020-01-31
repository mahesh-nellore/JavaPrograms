package javaconcepts;
class Emp{
	
	public void show() {
		System.out.println("I am Parent Class Method");
	}
	public void stop() {
		System.out.println("I am Parent class Stop Method");
	}
}

class Address extends Emp{
	public void show() {
		System.out.println("I am child class method");
	}
	public void run() {
		System.out.println("I am child class run Method");
	}
}
public class CastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp emp = new Address();
		emp.show();
		emp.stop();
		
		
		Address address = (Address) emp;
		address.run();

	}

}
