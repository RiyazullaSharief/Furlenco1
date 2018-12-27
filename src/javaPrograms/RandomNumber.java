package javaPrograms;
import java.util.Random;
public class RandomNumber
{
	public static void main(String[] args)
	{
		Random rand=new Random();
//		boolean b=rand.nextBoolean();
		long r=rand.nextLong();
		rand.nextInt();
		long r1=Math.abs(r);
		String str=Long.toString(r1,30)+"@gmail.com";
//		System.out.println(b);
		System.out.println(str);
	}
}
