package javaPrograms;
public class DeleteAParticularCharater
{
	static String s="deleteduplicate";
	public static void run(String str,int index)
	{
		String s1=str.substring(0,index);
		String s2=str.substring(index+1);
		s=s1+s2;
		
	}
	
	public static void main(String[] args) 
	{
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='e')
			{
				run(s,i);
			}
		}
		System.out.println(s);
	}
}
