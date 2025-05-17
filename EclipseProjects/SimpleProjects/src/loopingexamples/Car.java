package loopingexamples;

public class Car {
	
	String make;
	String model;
	int year;
	
	Car()
	{
		 make="Hyundai";
		 model="verna";
		 year=2002;
	}
	Car(String m,String m1,int y)
	{
	
	make=m;
	model=m1;
	year=y;
	}
	void display()
	{
		System.out.println(make+" "+model+" "+year);
	}
	public static void main(String...args)
	{
		Car c1= new Car();
		Car c2= new Car("Honda","Accord",1991);
		Car c3= new Car("Toyota","Fortuner",1995);
	
		c1.display();
		c2.display();
		c3.display();
	}
}
	

