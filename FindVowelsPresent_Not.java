package stringPractice;

import java.util.Scanner;

//Q. Find Vowels Present in String or Not & if present how many time Vowels
public class FindVowelsPresent_Not {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.next();
		char ch[] = s.toCharArray();
		int c=0;
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
			{
				c=1;
			}
		}
		if(c==1)
		{
			System.out.println("Present");
		}else {
			System.out.println("Not Present");
		}
	}
}
