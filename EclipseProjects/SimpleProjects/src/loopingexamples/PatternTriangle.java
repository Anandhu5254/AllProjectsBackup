package loopingexamples;

import java.util.Scanner;

public class PatternTriangle {

public static void main(String...args)
{
	Scanner a= new Scanner(System.in);
	System.out.println("Enter number of rows");
	int rows =a.nextInt();
	
	for(int i=1; i<=rows; i++)
	{
		for(int j=rows; j>=i; j--)
		{
			System.out.print(" ");
		}
		for(int j=1; j<=i; j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
 }
}
