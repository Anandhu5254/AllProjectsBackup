package w3Resources;

 class Shape1 {

void displayShape()
{
	System.out.println("This is a shape");
}
}
class Circle extends Shape1 {
	
	
	void displayShape()
	{
	  System.out.println("This is a Circle");	
	}
}
class Rectangle extends Shape1 {
	
	void displayShape()
	{
	  System.out.println("This is a Rectangle");
	}
}
public class Shape {

public static void main(String[] args) {
	
	Circle c=new Circle();
	Rectangle r=new Rectangle();
	c.displayShape();
	r.displayShape();
}
}




