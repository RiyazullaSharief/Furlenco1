package javaPrograms;
import java.util.Random;
public class Randm
{
	public static void main (String[] args)
	{
		Random rand=new Random();
		int num1,num2,num3;
		int i=0;
		while(i++<=100)
		{
			num1=rand.nextInt(90)+10;
			num2=rand.nextInt(643)+100;
			num3=rand.nextInt(9000)+1000;
			//rand.nextin
			//System.out.println(num1+"-"+num2+"-"+num3);
			System.out.println("+91 "+"9"+num1+num2+num3);
		}
		Long l=(long)(Math.random()*10);
		System.out.println(l);
	}
}
