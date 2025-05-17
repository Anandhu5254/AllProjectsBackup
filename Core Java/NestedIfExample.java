class NestedIfExample
{
  public static void main(String[] args)
{
  int a=20; boolean id=false;
  if(a>=18)
  
 {
   System.out.println("age is greater than 18");
 
    if(id==true)
 {
   System.out.println("eligible for voting");
 }
   else
 {
   System.out.println("not eligible for voting");
 }

 }
  else
 {
  System.out.println("age is less than 18");
 }
 }
 }