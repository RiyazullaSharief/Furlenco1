package javaPrograms;
public class ReverseWordsUsingStringBuffer
{
	public static void main(String[] args)
	{
		String str="Im writing java program now";
		String[] split =str.split(" ");
		for(int i=0;i<split.length;i++)
		{
			String str1=new StringBuffer(split[i]).reverse().toString();
			System.out.print(str1+" ");
		}
	}
}
