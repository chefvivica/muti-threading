package regexdemos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex1 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile(".s");//seraching for single char ; before . can only have one char
		Matcher m = p.matcher("gs");
		boolean res = m.matches();
		System.out.println(res);
		
		//another way
		
		boolean b2= Pattern.compile(".s").matcher("as").matches();
		System.out.println(b2);
		
		
		
		
	}
}
