package evaluation1;

 class Shape1 {
	 
	 double calculateArea(double area)
	 {
		return area;
	 }
}
 class Circle extends Shape1 {
	 
	 double calculateArea(double radius)
	 {
		 double area=Math.PI*radius*radius;
		 return area;
	 }
 }
 class Rectangle extends Shape1 {
	 
	 double calculateArea(double length,double width)
	 {
		 double area=length*width;
		return area;
	 }
 }
 class Triangle extends Shape {
	 
	 double calculateArea(double base,double height)
	 {
		 double area=(base*height)/2;
		return area;
	 }
 }
 public class Shape {
	 
	 public static void main(String[] args) {
		
		 Circle c=new Circle();
		 Rectangle r=new Rectangle();
		 Triangle t=new Triangle();
		 System.out.println("area of circle is "+c.calculateArea(6.0));
		 System.out.println("area of Rectangle is "+r.calculateArea(5.0, 12.0));
		 System.out.println("area of Triangle is "+t.calculateArea(12.0, 7.0));
	}
 }
 
