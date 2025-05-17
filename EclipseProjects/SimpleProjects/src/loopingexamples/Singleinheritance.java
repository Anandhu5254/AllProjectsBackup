package loopingexamples;

 class Animal{

void eat()
{
	System.out.println("eating...");
}
 }
class Dog1 extends Animal {
	
void bark()
{
	System.out.println("barking...");
}
}
class Singleinheritance {
	
	public static void main(String...args)
	{
		Dog1 d1= new Dog1();
		d1.bark();
		d1.eat();
	}
}

