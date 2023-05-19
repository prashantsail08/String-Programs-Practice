package stringPractice;

import java.util.Scanner;

//capitalize each Starting Word
public class CapitalizeEachStartingWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.nextLine();
		String str[] = s.split(" ");
		String s5="";
		for(String w: str)
		{
			String s1 = w.substring(0,1);
			String s2= s1.toUpperCase();
			
			String s3 = w.substring(1);
			String s4 = s3.toLowerCase();
			
			s5= s5+s2+s4+" ";
		}
		System.out.println(s5);
	}
}
