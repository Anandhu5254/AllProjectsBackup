package sampleSpace;
import java.io.File;
import java.io.IOException;

public class NewFile {

public static void main(String[] args) {
	
	try
	{
		File f = new File("C:\\Users\\Vijith\\Desktop\\Examples\\Welcome.txt");
		if(f.createNewFile())
		{
			System.out.println("File "+f.getName()+" is created successfully");
		}
		else
		{
			System.out.println("The file is already existed");
		}
	}
		catch(IOException e)
		{
			System.out.println("An unexpected error occured");
			e.printStackTrace();
		}
		
	}
	
}
