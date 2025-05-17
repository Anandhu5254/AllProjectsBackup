package loopingexamples;

public class GetterSetter {

private int x,y;

public int getX()
{
	return x;
}
public int getY()
{
	return y;
}
public void setX(int x,int y)
{
	this.x=x;
	this.y=y;
}
 private void printHello()
{
	System.out.println("Hello");
}
public static void main(String...args)
{
	
	GetterSetter a=new GetterSetter();
	a.setX(4,5);
	System.out.println(a.getX());
	System.out.println(a.getY());
	a.printHello();
}
}
