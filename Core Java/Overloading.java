class Overloading{

  public static void main(String...args){

    hello();
    hello(6);
    hello(9,8);

                 }

   static void hello()
 {

  System.out.println("hello");

 }

  static void hello(int a)
 {

  System.out.println(a);

 }
  
  static void hello(int a,int b)
 {

  System.out.println(a+b);

 }

     }


