package w3Resources;

public class Book {

String Title;
String Author;
int Price;

Book()
{
	Title="Velicham";
	Author="Pallavi";
	Price=2000;
}
void display()
{
	System.out.println(Title+" "+Author+" "+Price);
}
Book(String t,String a)
{
	Title=t;
	Author=a;
}
Book(String t,String a,int p)
{
	Title=t;
	Author=a;
	Price=p;
}
public static void main(String[] args) {
	
	Book b=new Book();
	Book b1=new Book("Vellam","Narayan");
	Book b2=new Book("Vettam","Lakshmi",1500);
	b.display();
	b1.display();
	b2.display();
}
}
