package advancedJava;
import java.io.FileInputStream;
import java.io.IOException;

public class TwoLettersReadExample {

public static void main(String[] args) {
	
	try
	{
		FileInputStream inputStream=new FileInputStream("C:\\Users\\Vijith\\Desktop\\Examples\\Hello.txt");
		int firstByte=inputStream.read();
		int secondByte=inputStream.read();
		
		System.out.println("byte(as integer)"+firstByte);
		System.out.println("character(as char)"+(char)firstByte);
		System.out.println("byte(as integer)"+secondByte);
		System.out.println("character(as char)"+(char)secondByte);
		inputStream.close();
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
}
}
