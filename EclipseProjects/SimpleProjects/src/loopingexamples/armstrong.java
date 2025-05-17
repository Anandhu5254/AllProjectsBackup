package loopingexamples;

public class armstrong {

public static void main(String...args)
{
    int n=153;
	int num=153;
	int sum=0;
	while(num>0)
	{
	int rem=num%10;
	sum=sum+rem*rem*rem;
	num=num/10;
	}
	if(n==sum)
	{
		System.out.println("armstrong number");
	}
	else
	{
		System.out.println("Not armstrong number");
	}
		
	}
}

