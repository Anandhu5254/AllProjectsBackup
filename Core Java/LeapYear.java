class LeapYear
{
  public static void main(String...args)
{
  int Year=2035;
  if(Year%4==0 && Year%100!=0 || Year%4==0 && Year%400==0)
{
  System.out.println("Leap Year");
}
 else
{
 System.out.println("Not a Leap Year");
}
}
}