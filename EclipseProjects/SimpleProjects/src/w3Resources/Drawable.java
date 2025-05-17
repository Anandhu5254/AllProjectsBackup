package w3Resources;

	interface Rentable{
		  int calculateRent(int days);
	}
	abstract class Vehicle1 implements Rentable{
		int model,rateperday;
		String brand;
		
		  public int calculateRent(int days) {
			int rent=500;
			rent=rent*days;
			return rent;
		}
		
		Vehicle1()
		{
			this.brand="Vehicle Name";
			this.model=1990;
			this.rateperday=500;	
		}
		void toString(String brand,int model,int rateperday )
		{
			System.out.println("The brand is: "+brand);
			System.out.println("The model is: "+model);
			System.out.println("The rate per day is: "+rateperday);
		}
	}
	class Car1 extends Vehicle1{
		int rateperday=100;
		int seatcap=5;
		public int calculateRent(int days)
		{
			
			int value2=seatcap*rateperday;
			int rent1=value2*days;
			System.out.println("Rent for Car is: "+rent1);
			return rent1;
		}
	}
	class Bike extends Vehicle1{
		int sports=200;
		int rateperday=500;
		public int calculateRent(int days)
		{
			
			int value=rateperday+sports;
			int rent2=value*days;
			System.out.println("Rent for Bike is: "+rent2);
			return rent2;
		}
	}
	class Truck extends Vehicle1{
		int loadCap=3;
		int rateperday=800;
		public int calculateRent(int days)
		{
			int val=loadCap*rateperday;
			int rent3=val*days;
			System.out.println("The rent for Truck is: "+rent3);
			return rent3;
		}
	}
	public class Drawable
	{

		public static void main(String[] args) {
			Car1 c=new Car1();
			c.toString("BMW",95,1000);
			c.calculateRent(5);
			Bike b=new Bike();
			b.toString("Splendor",02,500);
			b.calculateRent(5);
			Truck t=new Truck();
			t.toString("Maruti",97,1500);
			t.calculateRent(5);
			

		}

	}
