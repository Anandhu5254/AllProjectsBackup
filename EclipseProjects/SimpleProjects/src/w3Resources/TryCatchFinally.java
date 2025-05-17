package w3Resources;

public class TryCatchFinally {

public static void main(String[] args) {
	
	try
	{
		int arr[]= {5,8,9};
		System.out.println(arr[5]);
	}
	catch(IndexOutOfBoundsException e)
	{
		e.printStackTrace();
	}
	finally
	{
		System.out.println("Hey");
	}
}
}
