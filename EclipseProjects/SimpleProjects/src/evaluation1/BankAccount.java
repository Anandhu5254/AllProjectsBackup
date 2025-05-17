package evaluation1;

class LowBalanceException extends Exception {
	
	LowBalanceException(String msg)
	{
		super(msg);
	}
}
class BankAccount1 {
	
	 double balance;
	double deposit(double amount)
	{
		balance+=amount;
		System.out.print("amount deposited successfully.the current account balance is:");
		return balance;
		
	}
	double withdraw(double amount)
	{
	   try
	    {
			
		if(amount>balance)
		{
			throw new LowBalanceException("error;low account balance;");
		}
		else
		{
			System.out.print("withdraw successfull.The current acount balance is:");
			balance-=amount;
		}
	    }
		catch(LowBalanceException e)
		{
			System.out.print("error;low account balance;");
		}
		
		return balance;	
	}
	double getBalance()
	{
		System.out.print("Account balance is ");
		return balance;
		
	}
}
	public class BankAccount {
		public static void main(String[] args) throws LowBalanceException {
			
			BankAccount1 b=new BankAccount1();
			b.balance=1000;
			System.out.println(b.withdraw(1200));
			System.out.println(b.deposit(500));
			System.out.println(b.withdraw(800));
			System.out.println(b.getBalance());
		}
	}

