package advancedJava;
import java.util.*;

public class VectorExample {
public static void main(String[] args) {
	
	Vector<String>vec=new Vector<String>();
	// adding elements using add() method of List
	vec.add("Lion");
	vec.add("Tiger");
	vec.add("Horse");
	vec.add("Buffallo");
	// adding elements using addElement() method of Vector
	vec.addElement("Dog");
	vec.addElement("Cat");
	vec.addElement("Deer");
	vec.addElement("Rabbit");
	System.out.println("Elements are: "+vec);
	System.out.println("Size is: "+vec.size());
	System.out.println("Capacity is: "+vec.capacity());
	if(vec.contains("Tiger"))
	{
		System.out.println("Tiger is present at the index "+vec.indexOf("Tiger"));
	}
	System.out.println("The first element in the vector is="+vec.firstElement());
	System.out.println("The last element of the vector is="+vec.lastElement());
	
}
}
 