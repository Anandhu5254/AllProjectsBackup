
package loopingexamples;

import java.util.Scanner;

public class Rio {

public static void main(String[] args) {

    Scanner myObj = new Scanner(System.in);
	String name1="Anandhu";
	String name2;
	
	do {
		System.out.println("Enter the name");
		name2=myObj.nextLine();
	}
	while(!(name1.equals(name2)));
}
}

	
