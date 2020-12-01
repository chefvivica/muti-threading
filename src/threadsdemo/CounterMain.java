package threadsdemo;

public class CounterMain {
	public static void main(String[] args) {
		Counter counter = new Counter();
		Counter counter1 = new Counter();
		
		counter.start();
		counter1.start();
	}
}
