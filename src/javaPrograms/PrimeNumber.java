package javaPrograms;
public class PrimeNumber
{
	public static void main(String[] args)
	{
		//int num=10;
		int start=1,end=100;
		for(int num=start;num<=end;num++)
		{
			boolean b=true;
			for(int i=2;i<num/2;i++)
			{
				if(num%i==0)
				{
					b=false;
					break;
				}
			}
			if(b==true)
				System.out.println(num);
				/*System.out.println("Its a prime number");
			else
				System.out.println("Its not a prime number");*/
		}
	}
}
