package loopingexamples;

public class Student {

int id;
String name;
char grade;

Student()
{
id=123;
name="jithu";
grade='A';
}
Student(int i,String n,char g)
{
	id=i;
	name=n;
	grade=g;
}
void display()
{
	System.out.println(id+" "+name+" "+grade);
}
public static void main(String...args)
{
	Student s1=new Student();
	Student s2=new Student(112,"Athulya",'B');
	

	s1.display();
	s2.display();
}
}