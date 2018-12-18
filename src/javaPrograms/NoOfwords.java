package javaPrograms;
public class NoOfwords
{
	public static void main(String[] args)
	{
		String str="Im writing java program now";
		int count=0;
		String[] split=str.split(" ");
		for(int i=0;i<split.length;i++)
		{
			int count1=0;
			for(int j=0;j<split[i].length();j++)
			{
				count1++;
			}
			System.out.println(split[i]+" contains: "+count1);
			count++;
		}
		System.out.println("Total words are: "+count);
	}
}
