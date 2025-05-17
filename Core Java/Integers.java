import java.util.Scanner;
 
 class Integers
{
 public static void main(String...args)
{
 Scanner myObj=new Scanner(System.in);
 System.out.print("Enter the first integer");
 int x=myObj.nextInt();
 System.out.print("Enter the second integer");
 int y=myObj.nextInt();
 System.out.print("Enter the third integer");
 int z=myObj.nextInt();
 System.out.print("Enter the fourth integer");
 int w=myObj.nextInt();

 if (x==y && y==z && z==w)
  {
   System.out.println("integers are equal");
  }
 else
{
 System.out.println("integers are not equal");
}
}
}

 

