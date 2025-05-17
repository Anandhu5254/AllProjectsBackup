package loopingexamples;

public class ExceptionExample2 {

public static void main(String...args) {

try
{
	int data=100/0;
}
catch(ArithmeticException e)
{
	System.out.println(e);
}
finally
{
	System.out.println("rest of the code");
}
}
}


