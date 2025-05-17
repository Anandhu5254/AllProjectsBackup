package w3Resources;

public class Person {

 private String name;
 private int age;
 private String country;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
 
 public static void main(String[] args) {
	
	 Person p1=new Person();
	 p1.setName("Akhil");
	 p1.setAge(21);
	 p1.setCountry("India");
	 System.out.println("Name: "+p1.getName());
	 System.out.println("Age: "+p1.getAge());
	 System.out.println("Country: "+p1.getCountry());
}
}