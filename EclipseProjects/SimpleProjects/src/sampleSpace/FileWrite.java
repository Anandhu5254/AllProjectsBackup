package sampleSpace;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

public static void main(String[] args) {
	
	try
	{
		FileWriter w=new FileWriter("C:\\Users\\\\Vijith\\Desktop\\Examples\\Welcome.txt");
		w.write("Hey welcome to JAVA");
		w.close();
		System.out.println("Content is successfully wrote to the file");
	}
	catch(IOException e)
	{
		System.out.println("Unexpected error occured");
		e.printStackTrace();
	}

}
	
}
