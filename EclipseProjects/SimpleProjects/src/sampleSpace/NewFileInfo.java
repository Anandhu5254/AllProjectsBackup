package sampleSpace;
import java.io.File;

public class NewFileInfo {

public static void main(String[] args) {
	
	File f=new File("C:\\Users\\Vijith\\Desktop\\Examples\\Welcome.txt");
		if(f.exists())	
		{
			System.out.println("The name of the file is "+f.getName());
			System.out.println("The absolute path of the file is "+f.getAbsolutePath());
			System.out.println("is file readable?: "+f.canRead());
			System.out.println("is file writable?: "+f.canWrite());
			System.out.println("The size of the file in bytes is "+f.length());
		}
		else
		{
			System.out.println("The file does not exist");
		}
}
}
