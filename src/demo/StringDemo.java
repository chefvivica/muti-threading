package demo;

public class StringDemo {
	public static void main(String[] args) {
		String msg = "welcome";
		String ms = "welcome";
		// above will point to the same obj;
		
		
		String s = "john";
		s.concat("poul");
		System.out.println(s);
		//output will be john
		s=s.concat("ny");
		
		System.out.println(s);
		//output will be johnny
		
		System.out.println(msg.equals(ms));//true
		System.out.println(msg==ms);//true
		
		String msg2 = new String("welcome");
		String msg3 = new String("welcome");
		// this is point to two diff objs 
		System.out.println(msg2==msg3);//false
		System.out.println(msg2.equals(msg3));//true
	}
}
