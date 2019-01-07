package javaPrograms;

class Lemon
{
	int wt;
	Lemon(int wt)
	{
		this.wt=wt;
	}
	
	/*public String toString()
	{
		return "" + wt;
	}*/
	public boolean equals(Object o)
	{
		return this.wt==((Lemon)o).wt;
	}
	
	public int hashCode()
	{
		return wt;
	}
	
	
}
public class StringPoolComparison
{
	public static void main(String[] args)
	{
		String s1=new String("watermelon");
		String s2="watermelon";
		String s3="water";
		String s4="melon";
		String s5="water"+"melon";
		String s6=s3+"melon";
		System.out.println(s1==s2);
		System.out.println("************************");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println("************************");
		System.out.println(s2==s5);
		System.out.println(s1==s6);
		
		Lemon l1=new Lemon(50);
		Lemon l2=new Lemon(50);
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l1==l2);
		System.out.println(l1.equals(l2));
		
		System.out.println(l1.getClass().getName()+"@"+Integer.toHexString(l1.hashCode()));
		System.out.println(l1.hashCode());
		System.out.println(l2.hashCode());
	}
}
