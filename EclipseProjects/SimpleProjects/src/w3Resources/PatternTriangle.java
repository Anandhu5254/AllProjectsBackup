package w3Resources;

import java.util.Scanner;

public class PatternTriangle {

public static void main(String[] args) {
	
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter a number");
	int rows=obj.nextInt();
	for(int i=1;i<=rows;i++)
	{
		for(int j=rows;j>=i;j--)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
