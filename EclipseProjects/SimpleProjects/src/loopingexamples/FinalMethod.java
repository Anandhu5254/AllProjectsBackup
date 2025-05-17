package loopingexamples;

 class Bike {

	final void run()
	{
		System.out.println("Running");
	}
 }
class FinalMethod extends Bike{
	
	// void run()
	{
		System.out.println("running safely within 100 km/hr");
	}
public static void main(String...args)
{
	FinalMethod f1=new FinalMethod();
	f1.run();
}
}
 
