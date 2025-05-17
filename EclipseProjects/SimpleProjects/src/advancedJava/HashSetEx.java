package advancedJava;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

public static void main(String[] args) {
	
	HashSet<String> set=new HashSet<String>();   
    set.add("One");     
    set.add("Two");     
    set.add("Three");    
    set.add("Four");   
    set.add("Five");   
    Iterator<String> i=set.iterator();   
    while(i.hasNext())   
    {   
    System.out.println(i.next());   
    }  
    set.remove("Five");
    set.removeIf(str->str.contains("Three"));   //Removing elements on the basis of specified condition  
    System.out.println("After invoking removeIf()  method: "+set);   
    set.removeAll(set);   
    System.out.println("After invoking removeAll() method: "+set);   
    set.clear();   //Removing all the elements available in the set   
    System.out.println("After invoking clear()  method: "+set);  
    
}   
}
