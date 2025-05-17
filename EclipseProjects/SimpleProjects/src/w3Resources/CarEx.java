package w3Resources;

class Car$ {
	
	private String make;
	private String model;
	private int year;
	
	
	
	Car$()
	{
		 make="Tata";
		 model="Tiago";
		 year=2002;
	}
	Car$(String m,String m1,int y)
	{
		make=m;
		model=m1;
		year=y;
	}
	void display()
	{
		System.out.println(make+" "+model+" "+year);
	}
}
public class CarEx {
	
public static void main(String[] args) {
	
    Car$ c1=new Car$();
    Car$ c2=new Car$("Hyundai","Verna",2012);
    c1.display();
    c2.display();
}
}
