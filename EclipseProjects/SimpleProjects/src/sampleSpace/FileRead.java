package sampleSpace;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
	
	public static void main(String[] args) {
		
		try
		{
			File f=new File("C:\\Users\\Vijith\\Desktop\\Examples\\Welcome.txt");
			Scanner scn=new Scanner(f);
			while(scn.hasNextLine())
			{
				String data=scn.nextLine();
				System.out.println(data);
			}
			scn.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("The file does not found");
			e.printStackTrace();
		}
	}
}


