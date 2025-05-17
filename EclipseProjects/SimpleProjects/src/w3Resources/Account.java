package w3Resources;

public class Account {

String accountNumber;
int balance;

Account(String a,int b)
{
	accountNumber=a;
	balance=b;
}
void display()
{

	if(accountNumber==null||accountNumber.isEmpty())
	{
		System.out.println("Error: Account number cannot be null or empty");
	}
	else
	{
		System.out.println("Account Number:"+accountNumber);
	}
	if(balance<0)
	{
		System.out.println("Error:Balance cannot be zero");
	}
	else
	{
		System.out.println("Balance:"+balance);
	}
}
public static void main(String[] args) {
	
	Account acc = new Account("158",-2456);
	acc.display();
}
}