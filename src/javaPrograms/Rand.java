package javaPrograms;
import java.util.Random;
public class Rand
{
	public static void main(String[] args)
	{
		int i=0;
		while(i<20)
		{
			//String chars="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			String chars="0123456789";
			Random r=new Random();
			StringBuilder s=new StringBuilder();
			while(s.length()<9)
			{
				int index=(int)(r.nextFloat()*chars.length());
				s.append(chars.charAt(index));
			}
			String str="9"+s.toString();
			System.out.println(str);
			i++;
		}
	}
}