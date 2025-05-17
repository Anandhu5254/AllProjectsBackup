package w3Resources;

class Animal$ {

void eat()
{
	System.out.println("The animal is eating");
}
}
class Dog$ extends Animal$ {
	
	void bark()
	{
		System.out.println("The dog is barking");
	}
}
class GermanSheperd extends Dog$ {
	
	void guard()
	{
		System.out.println("The GermanSheperd is guarding");
	}
}
public class Animal {
	
public static void main(String[] args) {
	
	GermanSheperd g=new GermanSheperd();
	g.guard();
	g.bark();
	g.eat();

}
}