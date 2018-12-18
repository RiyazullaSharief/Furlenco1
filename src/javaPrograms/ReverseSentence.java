package javaPrograms;
public class ReverseSentence
{
	public static void main(String[] args)
	{
		String str="Im writing java program now";
		String str1="";
		for(int j=str.length()-1;j>=0;j--)
		{
			str1=str1+str.charAt(j);
		}
		System.out.println(str1+" ");
	}
}
