package w3Resources;

class Geometry1 {

void draw()
{
	System.out.println("Geometrical shapes");
}
}
class Circle1 extends Geometry1 {
	
	void draw()
	{
		System.out.println("Draw a circle");
	}
}
class Rectangle1 extends Geometry1 {
	
	void draw()
	{
		System.out.println("Draw a rectangle");
	}
}
public class Geometry {
	
public static void main(String[] args) {
	
	Rectangle1 r= new Rectangle1();
	Circle1 c=new Circle1();
	r.draw();
	c.draw();
}
}
