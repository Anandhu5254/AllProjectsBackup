package loopingexamples;

public class ConstructorOverloading {

int id;
String name;
int age;

ConstructorOverloading(int i,String n,int a)
{
	id=i;
	name=n;
	age=a;
}
ConstructorOverloading(int i,String n)
{
	id=i;
	name=n;
	
}
void display()
{
	System.out.println(id+" "+name+" "+age);
}

public static void main(String...args)
{
	ConstructorOverloading s1=new ConstructorOverloading(225,"Aswin",17);
	ConstructorOverloading s2=new ConstructorOverloading(116,"Lekshmi",21);
	ConstructorOverloading s3=new ConstructorOverloading(121,"Arun");

  s1.display();
  s2.display();
  s3.display();
}
}