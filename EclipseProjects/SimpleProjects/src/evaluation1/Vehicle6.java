package evaluation1;

 class Vehicle {
	 
	 String brand="Tata";
	 int year=2000;
	 void displayInfo()
	 {
		 System.out.println(brand+" "+year+" ");
	 }
	
 }
 class Car extends Vehicle{
	 
	 int numberOfDoors=4;
	 void displayInfo()
	 {
		 System.out.println(brand+" "+year+" "+numberOfDoors);
	 }
 }
 class Motorcycle extends Vehicle{
	 
	 boolean hasSideCar=true;
	 void displayInfo()
	 {
		 System.out.println(brand+" "+year+" "+hasSideCar);
	 }
 }
 public class Vehicle6 {
	 
	 public static void main(String[] args) {
		
		 Vehicle v= new Vehicle();
		 Car c=new Car();
		 Motorcycle m=new Motorcycle();
		 v.displayInfo();
		 c.displayInfo();
		 m.displayInfo();	 
		
	}
 }
 



