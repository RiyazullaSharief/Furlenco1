package javaPrograms;

public class SortOfWordsBasedOnLength
{
	public static void main(String[] args)
	{
		String s1="im writing the new java program";
		String[] s2=s1.split(" ");
		String temp=" ";
		for(int i=0;i<s2.length-1;i++)
		{
			if(s2[i].length()>=s2[i+1].length())
			{
				temp=s2[i];
				s2[i]=s2[i+1];
				s2[i+1]=temp;
			}
			System.out.print(s2[i]+" ");	
		}
		System.out.print(temp);
	}
}
