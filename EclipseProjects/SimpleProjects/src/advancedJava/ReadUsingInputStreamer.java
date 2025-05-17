package advancedJava;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadUsingInputStreamer {

public static void main(String[] args) {
	
	try
	{
		InputStream inputStream=new FileInputStream("C:\\Users\\Vijith\\Desktop\\Examples\\Hello.txt");
		int byteData;
		while((byteData=inputStream.read())!=-1)
		{
			System.out.println("Byte(as integer):"+byteData);
			System.out.println("Character(as char) "+(char)byteData);
		}
		inputStream.close();
	}
		catch(IOException e)
	{
			e.printStackTrace();
	}
}
}

