package javaPrograms;
public class Pattern
{
	public static void main(String[] args)
	{
		for(int i=5;i>1;i--)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<i;k++)
			{
				System.out.print(i-k);
			}
			System.out.println();
		}
	}
}
