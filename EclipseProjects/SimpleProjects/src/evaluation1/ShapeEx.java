package evaluation1;

 class Shape3 {
   
	double calculateArea()
	 {
		 return 0.0;
	 }
}
 class Circle3 extends Shape3 {
	 
	 double radius;
	 double calculateArea()
	 {
		 double area= Math.PI*radius*radius;
		 System.out.print("area of circle is :");
		 return area;
	 }
 }
class Rectangle3 extends Shape3 {
	
	double length;
	double width;
	
	double calculateArea()
	{
		double area=length*width;
		System.out.print("area of rectangle is :");
		return area;
	}
}
class Triangle3 extends Shape3 {
 
	double base;
	double height;
	double calculateArea()
	{
		double area=(base*height)/2;
		System.out.print("area of triangle is :");
		return area;
	}	
}
public class ShapeEx {
	
	public static void main(String[] args) {
		
		Circle3 c=new Circle3();
		c.radius=6;
		Rectangle3 r= new Rectangle3();
		r.length=5;
		r.width=10;
		Triangle3 t=new Triangle3();
		t.base=10;
		t.height=16;
		
		Shape3 s[]=new Shape3[3];
		s[0]=c;
		s[1]=r;
		s[2]=t;
		for(Shape3 i:s)
		{
			System.out.println(i.calculateArea());
			
		}
				
	}
}
