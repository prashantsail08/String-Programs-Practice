package stringPractice;

import java.util.Scanner;

/*Q. Find Vowels Present in String or Not & 
Occurrence of Vowels & also find Occurrence of each Vowels*/
public class FindVowelsOccurrence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.next();
		int a=0,e=0,i=0,o=0,u=0;
		char ch[] = s.toCharArray();
		for(int j=0; j<ch.length; j++)
		{
			if(ch[j]=='a')
			{
				a++;
			}
			if(ch[j]=='e')
			{
				e++;
			}
			if(ch[j]=='i')
			{
				i++;
			}
			if(ch[j]=='o')
			{
				o++;
			}
			if(ch[j]=='u')
			{
				u++;
			}
		}
		int total = a+e+i+o+u;
		if(total>0)
		{
			System.out.println("A present :"+a);
			System.out.println("E present :"+e);
			System.out.println("I present :"+i);
			System.out.println("O present :"+o);
			System.out.println("U present :"+u);
			
		}
	}
}
