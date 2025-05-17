package loopingexamples;

class Animal1{
	void eat()
	{
		System.out.println("eating...");
	}
}
class Dog2 extends Animal1{
	void bark()
	{
		System.out.println("barking...");
	}
}
class BabyDog extends Dog2{
	void weep()
	{
		System.out.println("weeping...");
	}
}
class MultilevelInheritance {
	
	public static void main(String...args) {
	
	BabyDog b1= new BabyDog();
	b1.weep();
	b1.bark();
	b1.eat();
}
}
