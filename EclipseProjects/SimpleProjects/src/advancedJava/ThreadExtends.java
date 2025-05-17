package advancedJava;

public class ThreadExtends extends Thread {
	
	public void run()
	{
		System.out.println("Thread is running");
	}
	public static void main(String[] args) {
		
		ThreadExtends t1=new ThreadExtends();
		t1.start();
	}
}


