package w3Resources;

public class ThrowsKeywordEx extends Exception {

	ThrowsKeywordEx(String msg)
	{
		super(msg);
	}
	public static void main(String[] args) throws Exception {
		
		int age=16;
		if(age<18)
		{
			throw new Exception("not elogible for voting");
		}
		else
		{
			System.out.println("welcome to vote");
		}
	}
}
	
	
