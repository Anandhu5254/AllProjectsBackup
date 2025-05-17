package loopingexamples;

 class Animal3 {

void eat()
{
	System.out.println("eating...");
}
 }
 class Dog3 extends Animal3{
	 void bark()
	 {
		 System.out.println("barking...");
	 }
 }
 class Cat3 extends Animal3{
	
	void meow()
	 {
		 System.out.println("meowing...");
	 }
 }
 class HierarchicalInheritance{
	 
	 public static void main(String...args){
		 Cat3 c= new Cat3();
		 c.meow();
		 c.eat(); 
	 }
 }

 