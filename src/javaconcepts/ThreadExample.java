package javaconcepts;
class ExampleThread extends Thread{
	public void run() {
		System.out.println("Thread is running");
	}
}
public class ThreadExample {

	public static void main(String[] args) {
		ExampleThread thread = new ExampleThread();
		thread.start();

	}

}
