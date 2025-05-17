package loopingexamples;

public class IndexOfMethod {

public static void main(String...args) {
	
	String word="Hello";
	String txt ="Please locate where 'locate' occurs!";
	boolean result=word.equalsIgnoreCase("hello");
	 System.out.println(result);
	 System.out.println(txt.indexOf("locate"));
	 System.out.println(txt.charAt(0));
	 System.out.println(txt.substring(7));
	 System.out.println(txt.substring(0,7));
	 System.out.println(txt.replace("Please", "Kindly"));
	 System.out.println(txt.replace('P', 'b'));
	 System.out.println(txt.replace(txt, word));
	 System.out.println(txt.replaceFirst("locate","Locate"));
	 System.out.println(txt.replaceAll("locate","Locate"));
		
			
}
}

