package threadsdemo;

public class MainDemo {
	public static void main(String[] args) {
		ThreadDemo th = new ThreadDemo();
		Thread t = new Thread(th);
		t.start();	
	}
}
