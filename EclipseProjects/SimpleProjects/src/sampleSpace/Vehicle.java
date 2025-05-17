package sampleSpace;

class Vehicle5 {

void startEngine()
{
	System.out.println("Start the Vehicle");
}
void stopEngine()
{
	System.out.println("Stop the vehicle");
}
}
class Car extends Vehicle5 {
	
	void startEngine()
	{
		System.out.println("Start the car");
	}
	void stopEngine()
	{
		System.out.println("Stop the car");
	}
}
 class Motorcycle extends Vehicle5 {
	
	void startEngine()
	{
		System.out.println("Start the bike");
	}
	void stopEngine()
	{
		System.out.println("Stop the bike");
	}
	
 }
 public class Vehicle {
	 
 public static void main(String[] args) {
	
	Motorcycle m1=new Motorcycle();
	Car c1=new Car();
	m1.startEngine();
	m1.stopEngine();
	c1.startEngine();
	c1.stopEngine();
}
}