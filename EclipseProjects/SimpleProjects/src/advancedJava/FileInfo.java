package advancedJava;
import java.io.File;

public class FileInfo {

public static void main(String[] args) {
	
File fo=new File("C:\\Users\\Vijith\\Desktop\\Examples\\school.txt");
if(fo.exists())
{
	System.out.println("The name of the file is "+fo.getName());
	System.out.println("The absolute path of the file is "+fo.getAbsolutePath());
	System.out.println("is file writable ?:"+fo.canWrite());
	System.out.println("is file readable:"+fo.canRead());
	System.out.println("The size of the file in bytes is "+fo.length());	
}
else
{
	System.out.println("The file does not exist");
}
}
}