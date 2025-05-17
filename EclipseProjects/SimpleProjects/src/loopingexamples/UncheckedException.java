package loopingexamples;

public class UncheckedException {

public static void main(String...args) {
	String name="Asiya";
	if(name=="Asi")
	{
		System.out.println("It is Asiya");
	}
	else
	{
		throw new NullPointerException("Invalid");
	}
	
}
}
