package advancedJava;
import java.util.*;

class Student {

int rollno;
String name;
int age;

Student(int rollno,String name,int age)
{
	this.rollno=rollno;
	this.name=name;
	this.age=age;
}
}
public class UserDefinedClassObjects {
	
	public static void main(String[] args) {
		
	Student s1=new Student(1,"Aju",21);
	Student s2=new Student(2,"Karthika",21);
	Student s3=new Student(3,"Renju",21);
	
	ArrayList<Student>list=new ArrayList<Student>();
	list.add(s1);
	list.add(s2);
	list.add(s3);
	
	Iterator<Student> itr=list.iterator();
	while(itr.hasNext())
	{
		Student st=(Student)itr.next();
		System.out.println(st.rollno+" "+st.name+" "+st.age);
	}
}
}
