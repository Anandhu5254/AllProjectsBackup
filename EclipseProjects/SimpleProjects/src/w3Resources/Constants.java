package w3Resources;

public class Constants {
	
public static final double PI=3.14159;
public static double Area(double radius)
{
	return Math.PI*radius*radius;
	
}
public static void main(String[] args) {
	
	double radius=5;
	System.out.println("Area="+Area(15));
	System.out.println(radius);
}
}