package stringPractice;
//Find_SpecialCharacter_or_Number_Present or Not
import java.util.Scanner;
public class FindSpecialCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s =sc.nextLine();
		char ch[] = s.toLowerCase().toCharArray();
		int c=0;
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i]>='a' && ch[i]<='z')
			{
				
			}else {
				System.out.println(ch[i]);
				c++;
			}
		}
		System.out.println("Total Numbers : " + c);
	}

}
