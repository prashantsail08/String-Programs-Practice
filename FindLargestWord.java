package stringPractice;

import java.util.Scanner;

//find largest word in a string or sentence
public class FindLargestWord {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String");
	String s = sc.nextLine();
	String str[] = s.split(" ");
	int max= str[0].length();
	String f=" ";
	for(String w: str)
	{
		int l=w.length();
		if(max<l)
		{
			max=l;
			f=w;
		}
	}
	System.out.println(f+" "+max);
}
}
