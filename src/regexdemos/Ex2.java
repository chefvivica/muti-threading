package regexdemos;

import java.util.regex.Pattern;

public class Ex2 {
	public static void main(String[] args) {
		
		//[abc]-> a, b or c
		 System.out.println(Pattern.matches("[amn]?", "a"));
		 
		 
		//X?  -> x occurs once or not at all
		//X+  -> x occurs once or more times 
		//X*  -> x occurs zero or more times
		//X{n}  -> x occurs n times only
		 
		 System.out.println(Pattern.matches("\\d", "30"));//false
		 System.out.println(Pattern.matches("\\d", "3"));//true
		 System.out.println(Pattern.matches("\\d", "3med"));//false
		 
		 System.out.println(Pattern.matches("\\D", "n"));//true
		 System.out.println(Pattern.matches("\\D", "mdn"));//false 
		 // "\\d" single digital 
		 //"\\D" single Char
		 
		 
		 System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","ahdb12" ));
	}
}
 