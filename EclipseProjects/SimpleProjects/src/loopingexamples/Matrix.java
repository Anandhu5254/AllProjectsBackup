package loopingexamples;

public class Matrix {

public static void main(String...args)
{
	int Bikes[][]= {{3,2,1},{1,3,5}};
	for(int i=0;i<Bikes.length;i++)
	{
		for(int j=0;j<Bikes[i].length;j++)
		{
			System.out.print(Bikes[i][j]);
			System.out.print("  ");
		}
		    System.out.println("\n");
	}
}
}
