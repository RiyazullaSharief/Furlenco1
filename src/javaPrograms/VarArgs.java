package javaPrograms;

public class VarArgs
{
	public static void sum(int... arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		sum(12,9,10);
	}
}
