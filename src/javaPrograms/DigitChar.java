package javaPrograms;
public class DigitChar
{
	public static void main(String[] args)
	{
		String str="abcd123efgh456";
		char[] ch=str.toCharArray();
		String s1="",s2="";
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isDigit(ch[i]))
				s1+=ch[i];
				
			else if(Character.isAlphabetic(ch[i]))
				s2+=ch[i];
		}
		System.out.println(s1);
		System.out.println(s2);
	}
}
