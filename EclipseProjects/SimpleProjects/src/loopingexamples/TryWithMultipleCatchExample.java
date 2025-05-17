package loopingexamples;

public class TryWithMultipleCatchExample {

	public static void main(String...args) {
		try
		{
			int data=100/0;
		}
		catch(ArithmeticException e1)
		{
			System.out.println(e1);
		}
		catch(NullPointerException e2)
		{
			System.out.println(e2);
		}
		catch(ArrayIndexOutOfBoundsException e3)
		{
			System.out.println(e3);
		}
		finally
		{
			System.out.println("rest of the code");
		}
	}
}
	
	
	
	
	
	
	
	
	
	

