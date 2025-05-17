import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Buffered {
public static void main(String...args)throws Exception{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter name:");
String name=br.readLine();

System.out.println("Enter a id:");
int id=Integer.parseInt(br.readLine());

System.out.println("Enter Gender(M/F):");
char gender=(char)br.read();


System.out.println("Enter name:"+name);
System.out.println("Id:"+id);

System.out.println("Gen:"+gender);

}
}