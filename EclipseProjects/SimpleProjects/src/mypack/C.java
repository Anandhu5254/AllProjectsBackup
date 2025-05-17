package mypack;

public class C {
	
	protected int data = 40;
	
	protected void msg() {
		System.out.println("hello");
	}
	
	public static void main(String[] args) {
		
		C c = new C();
		System.out.println(c.data);
		c.msg();
				
	}

}

