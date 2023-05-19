package stringPractice;
//Q. Reverse String and find Pallindrome.
import java.util.Scanner;

public class ReversePallindrome {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String");
		String s = sc.next();
		
		char ch[] = s.toCharArray();
		
		String rev = "";
		
		for (int i = ch.length - 1; i >= 0; i--) {
			
			rev = rev + ch[i];
		}
	
		System.out.println(rev);
		
		if (s.equals(rev)) 
		{
			System.out.println("Its Pallindrome");
		} 
		else 
		{
			System.out.println("Its not Pallindrome");
		}
	}
}
