package advancedJava;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

public static void main(String[] args) {
	
	try
	{
	FileWriter fwrite=new FileWriter("C:\\Users\\Vijith\\Desktop\\Examples\\school.txt");
	fwrite.write("A named location used to store related information is referred to as a file");
	fwrite.close();
	System.out.println("content is successfully wrote to the file");
}
	catch(IOException e)
	{
		System.out.println("Unexpected error occured");
		e.printStackTrace();
	}
}
}
