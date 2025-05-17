package loopingexamples;

public class CustomUncheckedException extends RuntimeException{
		
	CustomUncheckedException(String msg)
	{
		super(msg);
	}
	public static void main(String...args) 
	
	{
		int age=16;
		if(age<18)
		{
			throw new CustomUncheckedException("Invalid");
		}
		else
		{
			System.out.println("It is possible");
		}
		
	}
	}
		
		

