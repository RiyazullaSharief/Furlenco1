package javaPrograms;
public class ReverseWords
{
	public static void main(String[] args)
	{
		String str ="Im writing java program now";
		String[] split=str.split(" ");
		for(int i=0;i<split.length;i++)
		{
			String str1="";
			for(int j=split[i].length()-1;j>=0;j--)
			{
				str1=str1+split[i].charAt(j);
			}
			//str1=str1+str2+" ";
			System.out.print(str1+" ");
		}
	
	}
}
