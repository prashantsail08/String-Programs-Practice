package stringPractice;

import java.util.Scanner;

//Q. Find Letter 'a' Present in String or Not.
public class FindLetterPresentInString {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String");
	String s = sc.next();
	char ch[] = s.toCharArray();
	int p=0;
	for(int i=0; i<ch.length; i++)
	{
		if(ch[i]=='a')
		{
			p=1;
		}
	}
	if(p==1)
	{
		System.out.println("Present");
	}else {
		System.out.println("Not Present");
	}

}
}
