package loopingexamples;

public class Vehicle {

	String Brand;
	String Model;
	int Serialnumber;
	
	public static void main(String...args)
	{
		Vehicle car=new Vehicle();
		Vehicle bike=new Vehicle()	;
	
		System.out.println(car.Brand);
		System.out.println(car.Model);
		System.out.println(car.Serialnumber);
		System.out.println(bike.Brand);
		System.out.println(bike.Model);
		System.out.println(bike.Serialnumber);
	}
}
	
	
