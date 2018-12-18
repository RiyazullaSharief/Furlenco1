package javaPrograms;
public class MissedNumber
{
	public static void missing(int[] arr,int total)
	{
		int expected=total*(total+1)/2;
		int actual=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			actual=actual+arr[i];
		}
		int miss=expected-actual;
		System.out.println("The Missing Number is: "+miss);
	}
	
	public static void main(String[] args)
	{
		MissedNumber.missing(new int[] {1,2,4,5},5);
		MissedNumber.missing(new int[] {1,2,3,4,5,7,8,9,10},10);
	}
}
