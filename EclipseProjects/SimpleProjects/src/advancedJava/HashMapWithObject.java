package advancedJava;

import java.util.HashMap;
import java.util.Map.Entry;

class Book1 {
	
	int id;     
	String name,author,publisher;     
	int quantity;     
	public Book1(int id, String name, String author, String publisher, int quantity) {     
	this.id = id;     
	this.name = name;     
	this.author = author;     
	this.publisher = publisher;     
	this.quantity = quantity;     
	}     
	}     
	public class HashMapWithObject {     
	public static void main(String[] args) {     
	HashMap<Integer,Book1> map=new HashMap<Integer,Book1>(); 	
	Book1 b1=new Book1(101,"Nalinam","Siyana","Rio",50);
	Book1 b2=new Book1(102,"Kavyam","Kavya","Aju",10);
	Book1 b3=new Book1(103,"Goodalochana","Anandhu","Maya",25);
	map.put(101, b1);
	map.put(102, b2);
	map.put(103, b3);
	for(Entry<Integer,Book1>m:map.entrySet())
	{
		int key=m.getKey();
		Book1 b=m.getValue();
		System.out.println(key+" Details:");
		System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
	}
}
	}
