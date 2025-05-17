package loopingexamples;

public class CustomException1 extends RuntimeException{


CustomException1(String msg)
{
	super(msg);
}	
	static void Odd(int num) {
		
		if(num%2==0)
		{
			System.out.println("The given number is even");
		}
		else
		{
			throw new CustomException1("Invalid");
		}
	}
	public static void main(String[] args) 
	{
		Odd(3);
	}
}


	
	


