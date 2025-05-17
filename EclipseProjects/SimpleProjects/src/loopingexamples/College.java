package loopingexamples;

public class College {

int id;
String name;
String trade;

College(int i,String n,String t)
{

name=n;
trade=t;
id=i;

}

void display()
{
	System.out.println(id+" "+name+" "+trade);
}

public static void main(String...args)
{
	College s1=new College(123,"Akhil","Mechanicl");
	College s2=new College(113,"Kishor","Automobile");
	College s3=new College(118,"Mariyam","Electrical");
	
	s1.display();
	s2.display();
	s3.display();
}
}


