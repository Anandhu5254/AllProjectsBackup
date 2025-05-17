package loopingexamples;

public class Book {

String author;
String title;
int price;

Book()
{
	author="joy";
	title="Hope";
	price=2500;	
}
Book(String a,String t,int p)
{
	author=a;
	title=t;
	price=p;
}
Book(String a,String t)
{
	author=a;
	title=t;
}
void display()
{
	System.out.println(author+" "+title+" "+price);
}
public static void main(String...args)
{
Book b1=new Book();
Book b2=new Book("Siyana","manchadi",250);
Book b3=new Book("Malini","Balarama");

b1.display();
b2.display();
b3.display();
}
}