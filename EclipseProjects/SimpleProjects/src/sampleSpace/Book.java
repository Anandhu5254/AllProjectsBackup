package sampleSpace;

public class Book {

String Title;
String Author;
int Price;

Book()
{
	Title="Balarama";
	Author="Siyana";
	Price=750;
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
	
	Book b1=new Book();
	Book b2=new Book("Balabhoomi","Arun");
	Book b3=new Book("Vettam","Nalini",1000);
	b1.display();
	b2.display();
	b3.display();
}
}
