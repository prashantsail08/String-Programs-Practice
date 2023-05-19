package stringPractice;

import java.util.Scanner;

//take character from user and delete that character from string.
public class TakeCharacterFromUserAndDelete {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.next();
		System.out.println("Enter Character you want to Delete");
		char d = sc.next().charAt(0);
		char ch[] =s.toCharArray();
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i]!=d)
			{
				System.out.print(ch[i]);
			}
		}
		
	}

}
