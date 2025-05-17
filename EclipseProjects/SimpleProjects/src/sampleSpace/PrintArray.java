package sampleSpace;

public class PrintArray {

public static void main(String[] args) {
	
	int a[]= {5,6,7,8};
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	   System.out.println("\n");
	   
    int b[]=a;
    for(int j:b)
     {
	   System.out.println(j);
     }
}
}
  
