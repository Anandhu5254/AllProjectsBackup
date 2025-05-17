package advancedJava;
import java.util.*;
import java.util.Map.Entry;

public class HashMapEx {
public static void main(String[] args) {
	
	HashMap<Integer,String> map=new HashMap<Integer,String>();
	map.put(1,"Mango");
	map.put(2,"Apple");
	map.put(3,"Banana");
	map.put(4,"Grapes");
	System.out.println("Iterating Hashmap...");
	for(Entry<Integer, String> m:map.entrySet())
	{
		System.out.println(m.getKey()+" "+m.getValue());
	}	
	map.putIfAbsent(5, "Guava");   
	HashMap<Integer,String> m=new HashMap<Integer,String>();   
	m.put(6,"Strawberry");   
	m.putAll(map);  
	for(Entry<Integer, String> a:m.entrySet())
	{
		System.out.println(a.getKey()+" "+a.getValue());
	}	
	HashMap<Integer,String> list=new HashMap<Integer,String>(); 
	list.put(101,"Kaveri");
	list.put(102,"Mariyam");
	list.put(103,"Rio");
	list.put(104,"Jennifer");
	for(Entry<Integer,String>ls:list.entrySet())
	{
		System.out.println(ls.getKey()+" "+ls.getValue());
	}
	list.remove(102);
	list.remove(103,"Rio");
	list.replace(101,"Siyana");
	list.replace(104,"Jennifer","Anandhu");
	for(Entry<Integer,String>ls:list.entrySet())
	{
		System.out.println(ls.getKey()+" "+ls.getValue());
	}
	list.replaceAll((k,v)->"Dharsana");
	for(Entry<Integer,String>ls:list.entrySet())
	{
		System.out.println(ls.getKey()+" "+ls.getValue());
	}
}
}
