package stringPractice;

import java.util.Scanner;

//Q. find duplicate character in String
public class FindDuplicateCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.next();

		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int counter = 0;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					ch[j] = 0;
					counter = 1;
				}
			}
			// below condition will print duplicate character
//			if(counter!=0 && ch[i]!=0) {
//				System.out.print(ch[i]);
//			}
//			
			// below condition will not print duplicate character
			if (counter == 0 && ch[i] != 0) {
				System.out.print(ch[i]);
			}

		}
	}
}
