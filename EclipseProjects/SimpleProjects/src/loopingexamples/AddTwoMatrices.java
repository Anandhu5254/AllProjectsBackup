package loopingexamples;

public class AddTwoMatrices {

public static void main(String...args)
{
	int A[][]= {{3,2,1},{1,3,5}};
	for(int i=0;i<A.length;i++)
	{
		for(int j=0;j<A[i].length;j++)
		{
			System.out.print(A[i][j]);
			System.out.print("  ");
		}
		    System.out.println("\n");
	}
	System.out.println("\n");
	int B[][]= {{7,8,9},{6,3,2}};
	for(int i=0;i<B.length;i++)
	{
		for(int j=0;j<B[i].length;j++)
		{
			System.out.print(B[i][j]);
			System.out.print("  ");
		}
		    System.out.println("\n");
	}
	System.out.println("\n");
   int C[][]=new int[2][3];
   for(int i=0;i<C.length;i++)
	{
		for(int j=0;j<C[i].length;j++)
		{
			System.out.print(A[i][j]+B[i][j]);
		    System.out.print("  ");
		}
		System.out.println("\n");
	}
}
}
			


