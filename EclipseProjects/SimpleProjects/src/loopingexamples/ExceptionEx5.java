package loopingexamples;

public class ExceptionEx5 {

 void check(int weight) throws ExceptionEx4
 {
	if(weight<100) 
	{
		throw new ExceptionEx4("Under weight");
	}
 }
 public static void main(String...args)
 {
	 ExceptionEx5 a= new ExceptionEx5();
	 try
	 {
		 a.check(50);
	 }
	 catch(ExceptionEx4 e)
	 {
		 System.out.println(e.getMessage());
	 }
 }
	 
 }
