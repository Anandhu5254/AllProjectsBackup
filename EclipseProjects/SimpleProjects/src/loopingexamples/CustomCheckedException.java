package loopingexamples;

public class CustomCheckedException extends Exception{
	
CustomCheckedException(String msg)
{
	super(msg);
}
public static void main(String...args) throws CustomCheckedException
{
	int age=16;
	if(age<18)
	{
		throw new CustomCheckedException("Invalid");
	}
	else
	{
		System.out.println("It is possible");
	}
	
}
}
