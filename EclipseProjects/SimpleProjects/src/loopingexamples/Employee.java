package loopingexamples;

public class Employee {

int id;
String name;
int age;
int salary;

public static void main(String...args)
{

Employee a1=new Employee();
Employee a2=new Employee();
Employee a3=new Employee();

a1.id=111;
a1.name="Akhil";
a1.age=24;
a1.salary=20000;

a2.id=112;
a2.name="Abhira";
a2.age=20;
a2.salary=15000;

a3.id=113;
a3.name="Maya";
a3.age=26;
a3.salary=35000;

System.out.println(a1.id+" "+a1.name+" "+a1.age+" "+a1.salary);
System.out.println(a2.id+" "+a2.name+" "+a2.age+" "+a2.salary);
System.out.println(a3.id+" "+a3.name+" "+a3.age+" "+a3.salary);

}
}


