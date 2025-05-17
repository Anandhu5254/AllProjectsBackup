package advancedJava;
import java.io.FileOutputStream;

public class WriteStringUsingOutputStreamer {
    public static void main(String[] args) {
		
    	try
    	{
    		FileOutputStream fout=new FileOutputStream("C:\\Users\\Vijith\\Desktop\\Examples\\Hello.txt");
    		String data="Welcome to javaTpoint";
    		byte b[]=data.getBytes();
    		fout.write(b);
    		fout.close();
    		System.out.println("Success");
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
	}
}

