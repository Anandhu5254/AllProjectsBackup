package loopingexamples;

public class SumOfAllTheItemsInArray {

public static void main(String...args)
{
	int sum=0;
	int arr[]= {3,5,4};
	for(int i=0;i<arr.length;i++)
	{
		sum+=arr[i];
	}
	System.out.println(sum);
	
}
}
