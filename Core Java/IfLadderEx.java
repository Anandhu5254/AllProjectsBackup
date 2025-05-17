class IfLadderEx{

  public static void main(String...args)
 {
  int mark=80;
  
  if(mark>=90)
 {
  System.out.println("Grade is A+");

 }
  else if(mark>=80 && mark<90)
 {
  System.out.println("Grade is A");
 }
  else if(70>=mark && mark<80)
 {
  System.out.println("Grade is B+");
 }
  else if(60>=mark && mark<70)
 {
  System.out.println("Grade is B");
 }
  else if(50>=mark && mark<60)
 {
  System.out.println("Grade is C+");
 }
  else
 {
  System.out.println("failed");
 }
 }
 }