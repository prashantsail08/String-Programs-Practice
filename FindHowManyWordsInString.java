package stringPractice;

import java.util.Scanner;

//Find how many words Present in String?
public class FindHowManyWordsInString {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String");
	String s = sc.nextLine();
	String str[] = s.split(" ");
	int c=0;
	for(String w : str)
	{
		c++;
	}
	System.out.println(c);
}
}
