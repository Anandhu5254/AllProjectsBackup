package loopingexamples;

public class ParameterisedConstructor {

int id;
String name;

ParameterisedConstructor(int i,String n)
{
 
  id=i;
  name=n;
}

 void display()
 {
	 System.out.println(id+" "+name);
 }
 public static void main(String...args)
 {
	 ParameterisedConstructor s1=new ParameterisedConstructor(111,"Arjun");
	 ParameterisedConstructor s2=new ParameterisedConstructor(123,"Maya");
 
     s1.display();
     s2.display();
     
 }
}
 

