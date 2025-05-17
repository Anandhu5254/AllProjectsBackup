package loopingexamples;

public class MethodOops {

int rollnumber;
String name;

void insertRecord(int r,String n)
{
	rollnumber=r;
	name=n;
}
  void displayInformation()
  {
  System.out.println(rollnumber+" "+name);
  }

  public static void main(String...args)
  {
  
  MethodOops student1=new MethodOops();
  MethodOops student2=new MethodOops();
  
  student1.insertRecord(111,"Karan");
  student2.insertRecord(222,"Aryan");
  
  student1.displayInformation();
  student2.displayInformation();
}
}