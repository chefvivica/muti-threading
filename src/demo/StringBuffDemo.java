package demo;

public class StringBuffDemo {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("hello");
		System.out.println("length: " + sb.length());
		sb.append("a");
		System.out.println(sb);
	}
}
