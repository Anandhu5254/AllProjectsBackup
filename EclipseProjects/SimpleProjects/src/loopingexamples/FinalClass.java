package loopingexamples;

 class Bike1 {}                //Final
 
class FinalClass extends Bike1{            //cannot extends Bike1 cus Final
	 void run()
	 {
		 System.out.println("running safely with 100kmph");
	 }
 public static void main(String...args)
 {
	 FinalClass F1=new FinalClass();
	 F1.run();
 }
 }


