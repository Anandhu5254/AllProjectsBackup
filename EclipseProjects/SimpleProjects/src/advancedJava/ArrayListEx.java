package advancedJava;
import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		
		ArrayList<String>list=new ArrayList<String>();
		list.add("Anandhu");
		list.add("Siyana");
		list.add("Rio");
		list.add("jennifer");
		System.out.println(list);
		for(String n:list)
		{
			System.out.println(n);
		}
		list.add("Apple");
		list.add("Orangge");
		list.add("Guava");
		list.add("Grape");
		System.out.println(list);
		System.out.println("Returning element: "+list.get(3));
		list.set(0, "Arjun");
		System.out.println(list);
		list.remove(2);
		list.remove("Apple");
		System.out.println(list);
		list.clear();
		System.out.println(list);
		
		ArrayList<String>list2=new ArrayList<String>();
		System.out.println("Is ArrayList empty: "+list2.isEmpty());
		list2.add("Mariam");
		list2.add("Kaveri");
		list2.add("Ajin");
		System.out.println("After insertion");
		System.out.println("Is ArrayList empty: "+list2.isEmpty());
		System.out.println(list2);
		Collections.sort(list2);
		Iterator<String> itr=list2.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
