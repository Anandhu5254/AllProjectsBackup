package loopingexamples;

public class Example {

public static void main(String...args)
{	
 int num=153;
 int n=153;
 int sum=0;
 while(num>0)
 {
	int rem=num%10;
	sum=sum+rem*rem*rem;
	num=num/10;
 }
 if(n==sum)
 {
	 System.out.println("Armstrong number");
 }
 else
 {
	 System.out.println("Not an armstrong number");
 }
}
}
 
 
	




