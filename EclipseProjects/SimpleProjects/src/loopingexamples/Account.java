package loopingexamples;

public class Account {

long Accountnumber;
int balance;
Account(long a,int b)
{
	Accountnumber=a;
	balance=b;
}
void display()
{
	System.out.println(Accountnumber+" "+balance);
}
public static void main(String...args)
{
	Account s1= new Account(6293971100l,14000);
			s1.display();
}
}