package w3Resources;

 class FourWheeler {

void displayInfo()
{
	System.out.println("This is a vehicle");
}
}
class Car extends FourWheeler {
	
	void displayInfo()
	{
		System.out.println("This is a car");
	}
}
public class Vehicle {
	
public static void main(String[] args) {
	
	Car c=new Car();
	c.displayInfo();
}
}