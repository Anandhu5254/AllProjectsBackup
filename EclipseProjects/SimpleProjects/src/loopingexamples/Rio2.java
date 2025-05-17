package loopingexamples;

import java.util.Scanner;

public class Rio2 {

		public static void main(String[] args)
		{
			Scanner scn = new Scanner(System.in);
			
			String name1="Anandhu";
			String name2;
			System.out.println("Enter a name");
			name2 =scn.nextLine();
			while(true)
			{
				if(name1.equals(name2))
				{
					System.out.println("The names are same");
					break;
				}
				else
				{
					System.out.println("Enter a name");
					name2= scn.nextLine();
				}
			}
		}

}


