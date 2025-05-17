package loopingexamples;

public class ExceptionExample1 {

public static void main(String...args)
{
	int arr[]= {2,3,5};
try 
{
  System.out.println(arr[5]);
}
catch(ArrayIndexOutOfBoundsException e)
{
	System.out.println(e);
}
finally
{
	System.out.println("rest of the code");
	System.out.println(arr.length);
}
}
}

