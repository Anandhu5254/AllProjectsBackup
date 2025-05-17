package w3Resources;

public class ExceptionEx {

public static void main(String[] args) {
	
	try
	{
       int data =100/0;
	}
	catch(ArithmeticException e)
	{
		System.out.println(e);
	}
	finally
	{
		System.out.println("error");
	}
}
}
	
