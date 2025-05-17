package loopingexamples;

public class Dog {

String name;
String colour;

Dog(String n,String c)
{
	name=n;
	colour=c;
}
void display()
{
	System.out.println(name+" "+colour);
}
public static void main(String...args)
{
	Dog d1=new Dog("Bruno","Black");
	d1.display();
}
}
