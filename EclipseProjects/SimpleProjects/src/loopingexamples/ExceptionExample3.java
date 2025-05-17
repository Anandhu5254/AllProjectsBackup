package loopingexamples;

public class ExceptionExample3 {

static void validate(int age)	
{
	if(age<18)
	{
		throw new ArithmeticException("Invallid");
	}
	else
	{
		System.out.println("eligible for voting");
	}	
}
public static void main(String...args)
{
	validate(15);
	System.out.println("rest of the code");
}
}

