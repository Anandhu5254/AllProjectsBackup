package loopingexamples;
import java.util.Scanner;

public class PatternScanner {
	public static void main(String...args)
	{
		Scanner obj=new Scanner(System.in);
	System.out.println("Enter number of rows");
	int rows= obj.nextInt();
	
	for(int i=1; i<=rows; i++)
	 {
		 for(int j=1; j<=i; j++)
		 {
			 System.out.print("*");
		 }
		 System.out.print("\n");


}
}
}


