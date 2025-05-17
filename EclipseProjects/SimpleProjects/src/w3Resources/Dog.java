package w3Resources;

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
public static void main(String[] args) {
	
	Dog d = new Dog("Bruno","Black");
	d.display();
}
}


