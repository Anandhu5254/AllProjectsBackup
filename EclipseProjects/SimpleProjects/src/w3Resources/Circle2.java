package w3Resources;

public class Circle2 {
		
private double radius;

Circle2(double radius)
 {
	 this.radius=radius;
 }
void calculateArea()
 {
	 double area=Math.PI*radius*radius;
	 System.out.println("Area of the circle is "+area);
 }
public static void main(String[] args) {
	
Circle2 c=new Circle2(6.5);
c.calculateArea();

}
}

