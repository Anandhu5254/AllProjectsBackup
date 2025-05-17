package loopingexamples;

public class palindrome {

	public static void main(String...args)
	{
		int x=324;
		int num=324;
		int rev=0;
		while(num>0)
		{
			int rem=num%10;
			 rev=rev*10+rem;
			num=num/10;
		}
		 if(x==rev)
		 {
			 System.out.println("Palindrome number");
		 }
		 else
		 {
			 System.out.println("Not palindrome number");
		 }
	
	}
	}
	
