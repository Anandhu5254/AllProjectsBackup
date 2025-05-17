package loopingexamples;

abstract class Toyota{

abstract void Honda();
public void Tata()
{
 System.out.println("Tata Tiago");
}
}
class Hero extends Toyota
{
	public void Honda()
	{
		System.out.println("Honda Passion");
	}
}
class AbstractionExample{
	public static void main(String...args)
	{
		Hero a1=new Hero();
		a1.Honda();
		a1.Tata();
		
		
	}
	
}
