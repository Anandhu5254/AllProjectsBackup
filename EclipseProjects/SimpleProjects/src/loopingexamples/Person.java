package loopingexamples;

public class Person {

String name;
int age;

public static void main(String...args)
{
	Person p1=new Person();
	Person p2=new Person();
	
	System.out.println(p1.name);
	System.out.println(p1.age);
	System.out.println(p2.name);
	System.out.println(p2.age);
}
}