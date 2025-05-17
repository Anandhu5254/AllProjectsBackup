package w3Resources;

public class Student {

int id;
String name;
String grade;

Student()
{
	name="Anandhu";
	id=123;
	grade="First class";
}
Student(int i,String n,String g)
{
	id=i;
	name=n;
	grade=g;
}
void dispaly()
{
	System.out.println(id+" "+name+" "+grade);
}
public static void main(String[] args) {
	
	Student s1=new Student();
	Student s2=new Student(112,"Siyana","Second class");
	s1.dispaly();
	s2.dispaly();
}
}
