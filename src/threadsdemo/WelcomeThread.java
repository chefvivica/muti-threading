package threadsdemo;

public class WelcomeThread {
	public static void main(String[] args) {
//		Thread t = Thread.currentThread();
//		System.out.println("welcome   " + "thread:  " +t);
		System.out.println("welcome");
//		
//		t.setName("Viv");
//		t.setPriority(Thread.MIN_PRIORITY);//1
//		t.setPriority(Thread.MAX_PRIORITY);//10
//		t.setPriority(Thread.NORM_PRIORITY);//5

//		System.out.println("welcome   " + "thread:  " +t);
		
		try {
			Thread.sleep(3000);
			System.out.println("to");
			Thread.sleep(2000);
			System.out.println("hcl");
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		
	}
}
