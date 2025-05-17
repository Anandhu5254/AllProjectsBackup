package loopingexamples;

public class MethodOops1 {

int id;
String name;
int salary;

void x(int i, String n,int s)
{
	id=i;
	name=n;
	salary=s;
}

void y()
{
	
System.out.println(id+" "+name+" "+salary);

}

public static void main(String ...args)
{

MethodOops1 Employee1=new MethodOops1();
MethodOops1 Employee2=new MethodOops1();

Employee1.x(121,"Aswathy",18000);
Employee2.x(115,"Karthi",22000);

Employee1.y();
Employee2.y();
}
}








