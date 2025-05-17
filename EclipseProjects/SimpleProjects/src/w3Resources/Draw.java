package w3Resources;

interface Drawable2 {
  
	void draw();
}
class Rectangle9 implements Drawable2 {
	
	public void draw()
	{
		System.out.println("Draw a Rectangle");
	}
}
class Circle9 implements Drawable2 {
	
	public void draw()
	{
		System.out.println("Draw a Circle");
	}
}
public class Draw {
	
	public static void main(String[] args) {  
		
		Drawable2 d[]=new Drawable2[2];       // Rectangle9 r= new Rectangle9();
		d[0]=new Rectangle9();                // Circle9 c=new Circle9();
		d[1]=new Circle9();                   // Drawable12 d[]=new Drawable[2];
		                                      // d[0]=r;
		                                      // d[1]=c;
		for(Drawable2 i:d)                    // for(Drawable2 i:d)
		{                                     //  {
			i.draw();                         //       i.draw();
		}                                     //  }
	}
}                                              
