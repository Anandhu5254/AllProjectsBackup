package w3Resources;
import java.util.Scanner;

public class Pattern {

public static void main(String[] args) {
	
	Scanner myObj=new Scanner(System.in);
	System.out.println("Enter the number of rows");
	int rows=myObj.nextInt();
	
	for(int i=1;i<=rows;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.print("\n");
	}
	
	
}
}
