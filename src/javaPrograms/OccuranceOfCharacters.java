package javaPrograms;
public class OccuranceOfCharacters
{
	public static void main(String[] args)
	{
		String str="rajrekha";
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int count=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					ch[j]=' ';
					count++;
				}
			}
			//if(Character.isAlphabetic(ch[i]))
			if(ch[i]!=' ')
			System.out.println(ch[i]+" occured "+count);
		}
		System.out.println(ch.toString()                             );
		//System.out.println();
	}
}
