package stringPractice;

import java.util.Scanner;

/* print I start word , A ending word from "india is an island" 
print word start from i and end with a*/
public class PrintStarting_I_Ending_A {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String");
	String s = sc.nextLine();
	String str[] = s.split(" ");
	for(String w: str)
	{
		String s1 = w.substring(0,1);
		String s2= w.substring(w.length()-1);
		if(s1.equalsIgnoreCase("I") && s2.equalsIgnoreCase("A"))
		{
			System.out.println(w);
		}
	}
	
}
}
