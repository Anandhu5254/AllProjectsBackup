package advancedJava;
import java.util.*;

class Book {   
	int id;   
	String name,author,publisher;   
	int quantity;   
    Book(int id, String name, String author, String publisher, int quantity) {   
	this.id = id;   
	this.name = name;   
	this.author = author;   
	this.publisher = publisher;   
	this.quantity = quantity;   
	}   
	}
public class HashSetWithObject {
	public static void main(String[] args) {
	HashSet<Book>set=new HashSet<Book>();
	Book b1=new Book(101,"Nalinam","Siyana","Rio",50);
	Book b2=new Book(102,"Kavyam","Kavya","Aju",10);
	Book b3=new Book(103,"Goodalochana","Anandhu","Maya",25);
	set.add(b1);
	set.add(b2);
	set.add(b3);
	for(Book b:set)
	{
		System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
	}
	
}
}
