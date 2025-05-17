package loopingexamples;

public class StringClassMethods {

	public static void main(String[] args) {
		
		String message="  hello"+"!!  ";
		System.out.println(message.endsWith("!!"));
		System.out.println(message.startsWith("!!"));
		System.out.println(message.startsWith("hello"));
		System.out.println(message.length());
		System.out.println(message.indexOf("h"));
		System.out.println(message.replace("!", "j"));
		System.out.println(message.toUpperCase());
		System.out.println(message.toLowerCase());
		System.out.println(message.trim());
		
	}
}

