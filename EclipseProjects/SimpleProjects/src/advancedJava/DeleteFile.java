package advancedJava;
import java.io.File;

public class DeleteFile {
public static void main(String[] args) {
		
 File fo= new File("C:\\Users\\Vijith\\Desktop\\Examples\\school.txt");
 if(fo.delete())
 {
	System.out.println(fo.getName()+ "File is deleted successfully");
 }
 else
 {
	System.out.println("Unexpected error found in deletion of file");
 }
}
}

