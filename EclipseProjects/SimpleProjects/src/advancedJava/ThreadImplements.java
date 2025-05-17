package advancedJava;

public class ThreadImplements implements Runnable {

public void run()
{
	System.out.println("Thread is running...");
}
public static void main(String[] args) {
	
	ThreadImplements s1=new ThreadImplements();
	Thread t1=new Thread(s1);
	t1.start();
}
}
