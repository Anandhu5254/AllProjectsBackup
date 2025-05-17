package loopingexamples;

public class Reference {

int id;
String name;

public static void main(String...args)
{
	Reference student=new Reference();
	student.id=346;
	student.name="Abhi";
	
	System.out.println(student.id+ " " +student.name);
}
}
