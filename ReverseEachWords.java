package stringPractice;

import java.util.Scanner;

//Reverse Each Word
public class ReverseEachWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.nextLine();
		String str[] = s.split(" ");
		String rev="";
		for(String w: str)
		{
			char ch[] = w.toCharArray();
			for(int i=ch.length-1; i>=0; i--)
			{
				rev = rev+ch[i];
			}
			rev= rev+" ";
		}
		System.out.println(rev);
	}
}
