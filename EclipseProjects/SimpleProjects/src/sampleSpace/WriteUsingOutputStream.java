package sampleSpace;

import java.io.FileOutputStream;

public class WriteUsingOutputStream {
	
public static void main(String[] args) {
	
	try
	{
	 FileOutputStream fout=new FileOutputStream("C:\\Users\\Vijith\\Desktop\\Examples\\Hello.txt");
     fout.write(66);
     fout.close();
     System.out.println("Success");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
    