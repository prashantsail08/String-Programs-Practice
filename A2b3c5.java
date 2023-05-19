package stringPractice;

public class A2b3c5 {
	public static void main(String[] args) {
		String s ="a2b3c5";
		char ch[]=s.toCharArray();
		
		for(int i=0; i<ch.length; i=i+2)
		{
			char a=ch[i];
			char b=ch[i+1];
			
			String c = String.valueOf(b);
			int n= Integer.valueOf(c);
			for(int j=1; j<=n; j++)
			{
				System.out.print(a);
			}
		}
	}
}
