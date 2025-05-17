package sampleSpace;
import java.io.File;

public class FileDelete {

public static void main(String[] args) {
	
	File f= new File("C:\\Users\\Vijith\\Desktop\\Examples\\Welcome.txt");
	if(f.delete())
	{
		System.out.println("The file is deleted successfully");
	}
	else
	{
		System.out.println("An unexpected error found in deletion of file");
	}
}
}
