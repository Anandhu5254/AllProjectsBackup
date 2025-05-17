package advancedJava;
import java.io.File;
import java.io.IOException;

public class CreateFile {
	
	public static void main(String[] args) {
		
	try
	{
		File fo=new File("C:\\Users\\Vijith\\Desktop\\Examples\\school.txt");
		if(fo.createNewFile())
		{
			System.out.println("File"+fo.getName()+"is created successfully");
		}
		else
		{
			System.out.println("File is already exist in the directory");
		}
	}
	catch(IOException exception)
	{
		System.out.println("An unexpected error is occured");
		exception.printStackTrace();
	}
	
}
}


